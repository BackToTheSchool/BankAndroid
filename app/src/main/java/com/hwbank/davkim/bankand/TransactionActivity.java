package com.hwbank.davkim.bankand;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        final String transType = getIntent().getStringExtra("type");

        Button transButton = findViewById(R.id.trans_action_btn);
        TextInputLayout objAccTil = findViewById(R.id.trans_objacc_til);
        objAccTil.setVisibility(View.GONE);

        // 공통적으로 처리해야 할 뷰들 소환; account_number, balance.
        // balance_result는 실시간으로 처리해줘야 되니까 밑에서 연산해서 출력

        final String transTypeKr;       /// 거래타입의 한국어 변수
        // 액션바 이름 설정, 버튼 이름 설정
        if(transType.equals("sendmoney")){
            // 송금일 때 뷰
            transTypeKr="송금";
            getSupportActionBar().setTitle(transTypeKr);
            transButton.setText(transTypeKr);
            objAccTil.setVisibility(View.VISIBLE);
        } else if(transType.equals("withdraw")){
            // 출금일 때 뷰
            transTypeKr="출금";
            getSupportActionBar().setTitle(transTypeKr);
            transButton.setText(transTypeKr);
        } else {
            // 입금일 때 뷰
            transTypeKr="입금";
            getSupportActionBar().setTitle(transTypeKr);
            transButton.setText(transTypeKr);
        }

        transButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent resultIntent
                                = new Intent(TransactionActivity.this,TransactionResultActivity.class);
                        resultIntent.putExtra("type", transTypeKr);
                        Toast.makeText(TransactionActivity.this, transTypeKr+" 완료!", Toast.LENGTH_SHORT).show();
                        startActivity(resultIntent);
                        SelectAccountActivity.saa.finish();     //selectAccountActivity 꺼주기
                        TransactionActivity.this.finish();
                    }
                }
        );
    }

}
