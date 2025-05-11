package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    Scanner sc = new Scanner(System.in);

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login(){
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        String nim = sc.nextLine();

        if(nama.equalsIgnoreCase("farel wahyu firdaus") && nim.equals("202410370110130")){
            System.out.println("Login Success \n");
            displayInfo();
            displayAppMenu();
        }else {
            System.out.println("Login Failed");
        }
    }

    public void displayInfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Kelas : D");
        System.out.println("NIM : "+ getNim());
    }

    @Override
    public void reportItem() {
        System.out.print("Nama Barang : ");
        String namaBarang  = sc.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = sc.nextLine();
        System.out.print("Lokasi ditemukan : ");
        String lokasiDitemukan = sc.nextLine();

        System.out.println("\nLaporan Dikonfirmasi : ");
    }

    @Override
    public void viewReportedItems() {
        System.out.println("Fitur Belum Tersedia");
    }

    @Override
    void displayAppMenu() {
        int pilihan = 0;
        do {
        System.out.println("\n1. Laporkan Barang Hilang");
        System.out.println("2. Lihat Daftar");
        System.out.println("0. LogOut");
        System.out.print("Pilih : ");
        pilihan = sc.nextInt();
        sc.nextLine();


        switch (pilihan) {
            case 0 :
                System.out.println("Anda Telah LogOut");

                break;
            case 1:
                reportItem();
                break;
            case 2:
                viewReportedItems();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        }while (pilihan != 0);
    }
}
