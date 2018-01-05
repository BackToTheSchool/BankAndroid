package com.hwbank.davkim.item;

/**
 * Created by davki on 2018-01-06.
 */

public class CheckAccountItem {

    int count;
    String accBalTxt, accNumTxt;

    public String getAccBalTxt() { return accBalTxt; }
    public String getAccNumTxt() { return accNumTxt;  }

    public int getId() {
        return count;
    }

    public CheckAccountItem(String accBalTxt, String accNumTxt, int count){
        this.accBalTxt = accBalTxt;
        this.accNumTxt = accNumTxt;
        this.count = count;
    }

}
