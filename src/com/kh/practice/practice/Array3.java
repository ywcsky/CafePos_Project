package com.kh.practice.practice;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 입력 : ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] += i+1;
            System.out.print(arr[i] + " ");
        }

    }
}

