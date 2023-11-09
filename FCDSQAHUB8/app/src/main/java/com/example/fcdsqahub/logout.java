package com.example.fcdsqahub;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class logout extends AppCompatActivity {

    TextView textfullname,textemail;
    Button buttonlogout;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="Username";
    private static final String KEY_EMAIL="Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        textemail=findViewById(R.id.textemail);
        textfullname=findViewById(R.id.textfullname);
        buttonlogout=findViewById(R.id.logout1);

        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name=sharedPreferences.getString(KEY_NAME,null);
        String email=sharedPreferences.getString(KEY_EMAIL,null);

        if(name !=null|| email!=null){
            textfullname.setText("UserName -"+name);
            textemail.setText("password -"+email);
        }
        buttonlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(logout.this, "logoutsuccessful", LENGTH_SHORT).show();
                finish();
            }
        });
    }

}