package com.hwbank.davkim.bankand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.login_login_btn);
        Button signupBtn = findViewById(R.id.login_signup_btn);


        loginBtn.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(mainIntent);
                        LoginActivity.this.finish();
                    }
                }
        );

        signupBtn.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent signupIntent = new Intent(LoginActivity.this, SignUpActivity.class);
                        startActivity(signupIntent);
                    }
                }
        );

    }
}

