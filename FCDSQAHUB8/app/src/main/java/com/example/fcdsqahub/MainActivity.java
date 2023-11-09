package com.example.fcdsqahub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    EditText edittextname , edittextmail;
    Button savebutton;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="Username";
    private static final String KEY_EMAIL="Password";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextname=findViewById(R.id.edittextname);
        edittextmail=findViewById(R.id.edittextmail);
        savebutton=findViewById(R.id.savebutton);
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name =sharedPreferences.getString(KEY_NAME,null);

        if (name!=null){
            Intent intent =new Intent(MainActivity.this,MainActivity7.class);
            startActivity(intent);
        }

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_NAME,edittextname.getText().toString());
                editor.putString(KEY_EMAIL,edittextmail.getText().toString());
                editor.apply();
                Intent intent=new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "login Successs", Toast.LENGTH_SHORT).show();

            }
        });


    }
}