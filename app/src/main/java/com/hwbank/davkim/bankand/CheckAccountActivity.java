package com.hwbank.davkim.bankand;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hwbank.davkim.adapter.CheckAccountAdapter;
import com.hwbank.davkim.item.CheckAccountItem;
import com.hwbank.davkim.java.IntComma;

import java.util.ArrayList;
import java.util.List;


public class CheckAccountActivity extends AppCompatActivity{

    List<CheckAccountItem> items;
    Context mContext;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_account);
        RecyclerView accList = findViewById(R.id.check_account_list);

        mContext = this;
        layoutManager = new LinearLayoutManager(mContext);
        accList.setLayoutManager(layoutManager);
        items = new ArrayList<>();

        accList.setAdapter(new CheckAccountAdapter(items,mContext));

        int i = 123456789;
        items.add(new CheckAccountItem(IntComma.IntComma(i),"1002",0));
        items.add(new CheckAccountItem("41002","1003",1));
        items.add(new CheckAccountItem("41002","1003",2));
        items.add(new CheckAccountItem("41002","1003",3));
        items.add(new CheckAccountItem("41002","1003",4));

    }


}