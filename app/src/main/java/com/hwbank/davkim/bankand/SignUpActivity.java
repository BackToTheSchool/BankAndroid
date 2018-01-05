package com.hwbank.davkim.bankand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button signupBtn = findViewById(R.id.signup_action_btn);
        signupBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SignUpActivity.this, "회원가입 완료!", Toast.LENGTH_SHORT).show();
                        SignUpActivity.this.finish();
                    }
                }
        );
    }
}
