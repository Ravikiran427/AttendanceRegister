package com.example.attendanceregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int Login=0;
    String pin;
    EditText editText1,editText2;
    Button btn1,btn2;
    temp temp2 = new temp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);




        if(temp2.temp1==0)
        {
            setContentView(R.layout.activity_unregistered);
            editText1 = (EditText)findViewById(R.id.pin1);
            btn1 = (Button)findViewById(R.id.enter1);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pin = editText1.getText().toString();
                    if(pin.length()==4){
                        temp2.temp1 = Integer.parseInt(pin);
                        Login = Integer.parseInt(pin);
                        //startActivity(new Intent(MainActivity.this,registered.class));
                        setContentView(R.layout.activity_registered);
                        editText2 = (EditText)findViewById(R.id.pin2);
                        btn2 = (Button)findViewById(R.id.enter2);
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this,"sdwwef",Toast.LENGTH_SHORT).show();
                                pin = editText2.getText().toString();
                                if(Integer.parseInt(pin)==Login)
                                    startActivity(new Intent(MainActivity.this,subjectlist.class));
                                else
                                    Toast.makeText(MainActivity.this,"Entered PIN is wrong",Toast.LENGTH_LONG).show();
                            }
                        });
                        }
                    else
                        Toast.makeText(MainActivity.this,"PIN must have 4 digits",Toast.LENGTH_LONG).show();
                }
            });
            //startActivity(new Intent(MainActivity.this,unregistered.class));
        }

        else
        {
            setContentView(R.layout.activity_registered);
            editText2 = (EditText)findViewById(R.id.pin2);
            btn2 = (Button)findViewById(R.id.enter2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"sdwwef",Toast.LENGTH_SHORT).show();
                    pin = editText2.getText().toString();
                    if(Integer.parseInt(pin)==Login)
                        startActivity(new Intent(MainActivity.this,subjectlist.class));
                    else
                        Toast.makeText(MainActivity.this,"Entered PIN is wrong",Toast.LENGTH_LONG).show();
                }
            });
            //startActivity(new Intent(MainActivity.this,registered.class));
        }
    }
}
