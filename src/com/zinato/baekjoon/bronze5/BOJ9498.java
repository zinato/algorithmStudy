package com.zinato.baekjoon.bronze5;

import java.util.Scanner;

public class BOJ9498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char result = 'F';
        if (A >= 90) {
            result = 'A';
        } else if (A >=80) {
            result = 'B';
        } else if (A >= 70) {
            result = 'C';
        } else if (A >= 60) {
            result = 'D';
        }
        System.out.println(result);

    }
}
