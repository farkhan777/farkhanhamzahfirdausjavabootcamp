package org.bcafinance.materi.oop.service;

import org.bcafinance.materi.oop.IService;
import org.bcafinance.materi.oop.User;

public class ServiceOne implements IService<User> {

    @Override
    public void insert(User user) {//001-005
        //fv - error validasi (failed validation)
        //fe - error engine (failed error)
        //fe01001
        //fe01002
    }

    @Override
    public void update(User user) {//006-010
        //fv - error validasi (failed validation)
        //fe - error engine (failed error)
        //fv01015
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void findAll() {

    }
}

/*
Created By IntelliJ IDEA 2023.2.5 (Ultimate Edition)
@Author farha a.k.a. Farkhan Hamzah Firdaus
Java Developer
Crated on 16/02/2024 14:38
@Last Modified 16/02/2024 14:38
Version 1.0
*/
