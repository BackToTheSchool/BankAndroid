package com.hwbank.davkim.bankand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoIntent(R.id.main_createacc_txt,CreateAccountActivity.class);
        gotoIntent(R.id.main_check_txt,CheckAccountActivity.class);
        gotoIntent(R.id.main_sendmoney_txt,SelectAccountActivity.class,"sendmoney");

        gotoIntent(R.id.main_deposit_txt,SelectAccountActivity.class,"deposit");
        gotoIntent(R.id.main_withdraw_txt,SelectAccountActivity.class,"withdraw");

        TextView logoutTxt = findViewById(R.id.main_logout_txt);
        logoutTxt.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent logoutIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(logoutIntent);
                    MainActivity.this.finish();
                }
            }
        );
}

    /// View와 목적 액티비티를 넣으면 해당 액티비티로 넘어가는 메소드
    public void gotoIntent(int viewId, java.lang.Class objActivity) {
        final Intent intent = new Intent(this, objActivity);

        findViewById(viewId).setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(intent);
                    }

                }
        );
    }

    // 같은 액티비티를 재사용 하는 경우 StringExtra를 받아서 어떤 액티비티인지 구분해준다(오버로딩)
    public void gotoIntent(int viewId, Class objActivity, String extra){
        final Intent intent = new Intent(this, objActivity);
        intent.putExtra("type",extra);
        findViewById(viewId).setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(intent);
                    }

                }
        );

    }



}
