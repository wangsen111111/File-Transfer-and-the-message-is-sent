package com.wang.servlet;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //离散   大约数
        float f=0.1f;
        double d=1.0/10;
        System.out.println(f==d);
        //操作系统原理   010101010101010~
        double dd=10/3;
        System.out.println(dd);
        BigDecimal bigDecimalDd=new BigDecimal(2.3);
        System.out.println("bigDecimalDd:"+bigDecimalDd);
        System.out.println(2.3);


    }
}
