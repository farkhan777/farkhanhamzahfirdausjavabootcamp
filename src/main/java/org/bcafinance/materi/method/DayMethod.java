package org.bcafinance.materi.method;

import java.io.IOException;

import static org.bcafinance.materi.method.Secutiry.cobaFloat;

public class DayMethod extends Secutiry{
    private static String hue;
    public static void executeCobaFloat()
    {
        try {
            cobaFloat();
            cobaFloat(0.0f);
            cobaFloat(0.0f,1L);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
Created By IntelliJ IDEA 2023.2.5 (Ultimate Edition)
@Author farha a.k.a. Farkhan Hamzah Firdaus
Java Developer
Crated on 16/02/2024 10:00
@Last Modified 16/02/2024 10:00
Version 1.0
*/
