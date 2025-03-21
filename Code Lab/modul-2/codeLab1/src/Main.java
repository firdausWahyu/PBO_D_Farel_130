class Hewan { //class
    String nama, jenis, suara; // atribute

    public Hewan(String nama, String jenis, String suara) { //konstruktor
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo(){//method
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara + "\n");
    }
}

public class Main {//class main
    public static void main(String[] args) { //method main
        Hewan hewan1 = new Hewan("kucing", "mamalia", "nyan~~"); //membuat objek hewan1
        Hewan hewan2 = new Hewan("anjing", "mamalia", "woof-woof!!!"); //membuat objek hewan2

        hewan1.tampilkanInfo();//memanggil method tampilkanInfo
        hewan2.tampilkanInfo();
    }
}
