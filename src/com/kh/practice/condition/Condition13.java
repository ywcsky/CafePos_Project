package com.kh.practice.condition;

import java.util.Scanner;

public class Condition13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            for (int j = 0; j<3-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
