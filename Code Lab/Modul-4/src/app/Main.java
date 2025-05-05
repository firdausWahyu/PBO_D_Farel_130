package app;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        NonFiksi buku1 = new NonFiksi("Madilog", "Tan Malaka");
        Fiksi buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu");

        Anggota anggota1 = new Anggota("Farel", "130");
        Anggota anggota2 = new Anggota("Firdaus", "301");

        System.out.println(" ");

        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println(" ");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println(" ");

        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku("Hainuwele: Sang Putri Kelapa", 5);
        System.out.println(" ");

        anggota1.kembalikanBuku(buku1);
        anggota2.kembalikanBuku(buku2);


    }
}