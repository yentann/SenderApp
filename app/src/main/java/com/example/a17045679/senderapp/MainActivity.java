package com.example.a17045679.senderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Send = findViewById(R.id.buttonSend);

        //construct an Intent instance with the customised action
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcast.MY_BROADCAST");
                //send this broadcast to all receivers in an undefined order
                sendBroadcast(intent);
            }
        });
    }


}
