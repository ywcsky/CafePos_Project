package com.kh.day03.typetrans;

public class TestTypeTrans1 {
    public static void main(String[] args) {
        int iNum = 10;
        double dNum = 13.2;
        double result = iNum + dNum;
        System.out.println(result);
        System.out.println("강제형변환 " + (int)result);
        System.out.println("강제형변환 " + (char)65);


    }
}
