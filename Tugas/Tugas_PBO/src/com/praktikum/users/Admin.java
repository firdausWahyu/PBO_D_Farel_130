package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class Admin extends User implements AdminActions {


        Scanner sc = new Scanner(System.in);
        private String username;
        private String password;

    public Admin(String username, String password, String nama, String nim) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    @Override
    public void login(){
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan password: ");
            String password = sc.nextLine();

            if(username.equals("admin130") && password.equals("password130")){
                System.out.println("Login Success");
                displayAppMenu();
            }else {
                System.out.println("Login Failed");
            }
        }
    @Override
    public void displayInfo(){
            System.out.println("Login Sukses!");
        }

    @Override
    void displayAppMenu() {
        System.out.println("\n1. Kelola Laporan Barang");
        System.out.println("2. Kelola Data Mahasiswa");
        System.out.println("0. LogOut");
        System.out.print("Pilih : ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        do {


        switch (pilihan) {
            case 0 :
                System.out.println("Anda Telah LogOut");

                break;
            case 1:
                    manageItems();
                break;
            case 2:
                    manageUsers();
                break;
                default:
                    System.out.println("Pilihan tidak tersedia");
        }
       }while(pilihan != 0);
    }

    @Override
    public void manageItems() {
        System.out.println("Fitur Belum Tersedia");
    }

    @Override
    public void manageUsers() {
        System.out.println("Fitur Belum Tersedia");
    }
}
