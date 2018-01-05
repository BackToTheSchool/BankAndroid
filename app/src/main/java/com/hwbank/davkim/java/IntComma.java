package com.hwbank.davkim.java;

import java.text.DecimalFormat;

/**
 * Created by davki on 2018-01-06.
 */

public class IntComma {
    public static String IntComma(int num) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(num);
    }
}
