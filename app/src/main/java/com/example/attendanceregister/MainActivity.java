package com.example.attendanceregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int Login=0;

        if(Login==0)
        {
            startActivity(new Intent(MainActivity.this,unregistered.class));
        }

        else
        {
            startActivity(new Intent(MainActivity.this,registered.class));
        }
    }
}
