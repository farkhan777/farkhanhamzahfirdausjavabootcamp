package org.bcafinance;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
//        String a = "Jquery 1995@v1.0"; // return 529
//        String b = "Bebas Lepas@"; // return 238

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String input = sc.nextLine();

        int temp = 0;
        for (int i = 0; i < input.length(); i++) {
            char charTemp = input.charAt(i);
            int charToAschii = (int) charTemp;
            if (charToAschii < 97) {
                temp += charTemp;
            }
        }
        System.out.println("Hasil :" + temp);
    }
}