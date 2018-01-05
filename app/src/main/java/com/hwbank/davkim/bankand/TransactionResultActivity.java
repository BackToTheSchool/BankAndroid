package com.hwbank.davkim.bankand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransactionResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_result);

        String transType = getIntent().getStringExtra("type");

        getSupportActionBar().setTitle(transType+" 완료");

        Button homeBtn = findViewById(R.id.transres_home_btn);
        homeBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TransactionResultActivity.this.finish();
                    }
                }
        );
    }
}
