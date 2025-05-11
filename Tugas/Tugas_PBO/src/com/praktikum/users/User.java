package com.praktikum.users;

import java.util.Scanner;

public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }



    public abstract void login();

    public abstract void displayInfo();

    abstract void displayAppMenu();
}
