package com.hwbank.davkim.bankand;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


/**
 * Created by davki on 2018-01-06.
 */

public class CheckAccountAdapter extends RecyclerView.Adapter{

    Context mContext;
    List<CheckAccountItem> items;

    public CheckAccountAdapter(List<CheckAccountItem> items, Context mContext){ //생성자
        this.items= items;
        this.mContext = mContext;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_check_account,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder)holder).accBalTxt.setText(items.get(position).getAccBalTxt());
        ((ViewHolder)holder).accNumTxt.setText(items.get(position).getAccNumTxt());

        /// list item의 backgroundColor를 1개씩 번갈아서 흰/회 순서로 설정
        if(position % 2 == 1)
            ((ViewHolder)holder).checkItem.setBackgroundColor(Color.WHITE);


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView accNumTxt;
        TextView accBalTxt;
        LinearLayout checkItem;
        ViewHolder(View view){
            super(view);
            accNumTxt = view.findViewById(R.id.check_accnum_txt);
            accBalTxt = view.findViewById(R.id.check_balance_txt);
            checkItem = view.findViewById(R.id.check_item);
        }
    }

}
