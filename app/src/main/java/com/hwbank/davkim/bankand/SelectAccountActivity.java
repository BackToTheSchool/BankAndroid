package com.hwbank.davkim.bankand;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectAccountActivity extends AppCompatActivity {

    // transactionActivity에서 꺼주기 위해 만든 activity object 변수
    public static Activity saa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_account);
        saa=this;           // 이 액티비티를 할당

        // spiner 목록 불러와야됨


        // 아까 던진 StringExtra 받아서 다음 액티비티로 넘겨주기
        final Intent gotoIntent = new Intent(this,TransactionActivity.class);
        String transType = getIntent().getStringExtra("type");
        gotoIntent.putExtra("type",transType);

        // select_button에 인텐트 주기
        Button selBtn = (Button) findViewById(R.id.selacc_select_btn);
        selBtn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(gotoIntent);
                    }
                }
        );

    }

}
