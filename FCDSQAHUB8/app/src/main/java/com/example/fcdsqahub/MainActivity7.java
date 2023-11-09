package com.example.fcdsqahub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity7 extends AppCompatActivity {
    Fragment fragment = new HomeFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
        BottomNavigationView btnNav =findViewById(R.id.btn_nav);
        btnNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.data:
                        fragment= new dataFragment();
                        break;

                    case R.id.health:
                        fragment = new healthFragment();
                        break;
                    case R.id.homenav:
                        fragment = new HomeFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                return true ;


            }
        });
    }
}

