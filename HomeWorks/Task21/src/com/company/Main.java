package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int l = 1;
        char a[] = new char[n];
        for(int i = 0; i < n; i++) {
            a[i] = (char)scanner.nextInt();
        }

        for(int i = n - 1; i >= 0; i--) {
            k += a[i] * l;
            l *= 10;
        }
        System.out.println(k);



    }
}
