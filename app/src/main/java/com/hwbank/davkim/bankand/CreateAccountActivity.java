package com.hwbank.davkim.bankand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button createBtn = findViewById(R.id.create_action_btn);
        createBtn.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent createResultIntent;
                        createResultIntent = new Intent(CreateAccountActivity.this, CreateAccountResultActivity.class);
                        Toast.makeText(CreateAccountActivity.this, "계좌생성 완료!", Toast.LENGTH_SHORT).show();
                        startActivity(createResultIntent);
                        CreateAccountActivity.this.finish();
                    }
                }
        );
    }

}
