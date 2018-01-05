package com.hwbank.davkim.bankand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    /// 스플레쉬 페이지 타임 (밀리초 단위)
    private final int SPLASH_TIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();           /// 액션바 숨기기
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                //// MainActivity 실행 후, 스플레쉬 액티비티 종료
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        },SPLASH_TIME);
    }

}
