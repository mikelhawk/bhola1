package com.qnally.shappapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class Login extends AppCompatActivity {

    Button signup;
    Intent register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (Button) findViewById(R.id.create_new_acct);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register = new Intent(getApplicationContext(), RegistrationPersonalInfo.class);
                startActivity(register);
            }
        });

    }
}
