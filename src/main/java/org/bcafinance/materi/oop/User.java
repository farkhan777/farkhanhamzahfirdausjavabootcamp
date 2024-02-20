package org.bcafinance.materi.oop;

import java.time.LocalDate;

public class User {
    private String namaLengkap;
    private String email;
    private LocalDate dob;
    private String username;
    private String password;

    public User(String namaLengkap, String email, LocalDate dob, String username, String password) {
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

/*
Created By IntelliJ IDEA 2023.2.5 (Ultimate Edition)
@Author farha a.k.a. Farkhan Hamzah Firdaus
Java Developer
Crated on 16/02/2024 14:29
@Last Modified 16/02/2024 14:29
Version 1.0
*/
