package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        char a[] = l.toCharArray();

        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num = num * 10 + (a[i] - '0');
        }
        System.out.println(num);
    }
}