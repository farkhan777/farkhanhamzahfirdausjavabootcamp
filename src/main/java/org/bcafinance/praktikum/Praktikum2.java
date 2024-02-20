package org.bcafinance.praktikum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        double total = 0;
        int i = 0;
        while (sc.hasNextDouble()) {
            try {
                double numb = sc.nextDouble();
                total += numb;
                i++;
            } catch (InputMismatchException e) {
                break;
            }
        }
        double avg = total / i;
        System.out.print("Output: Rata-rata: " + avg);
    }
}

/*
Created By IntelliJ IDEA 2023.2.5 (Ultimate Edition)
@Author farha a.k.a. Farkhan Hamzah Firdaus
Java Developer
Crated on 20/02/2024 13:05
@Last Modified 20/02/2024 13:05
Version 1.0
*/
