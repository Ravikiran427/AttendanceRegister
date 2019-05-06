package com.example.attendanceregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class unregistered extends AppCompatActivity {

    Button enter;
    String pin=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unregistered);

        EditText editText = (EditText)findViewById(R.id.pin);
        pin = editText.getText().toString();

        enter = (Button)findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin.length()==4)
                    startActivity(new Intent(unregistered.this,registered.class));
                else
                    Toast.makeText(unregistered.this,"only "+pin+" digits",Toast.LENGTH_LONG).show();
            }
        });

    }

}
