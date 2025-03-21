class RekeningBank{//class
    String nomorRekening, namaPemilik;//Atribut
    double saldo;//Atribut

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo){//konstruktor
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo(){//method
        System.out.println("Nomor rekening: " + nomorRekening);
        System.out.println("Nama pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo + "\n");
    }

    void setorUang(double jumlah/* parameter*/){ // method setor uang
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp." + jumlah + " saldo sekarang : " + saldo);
    }

    void tarikUang(double jumlah/*parameter*/){

        if(saldo >= jumlah){//percabangan

            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp." + jumlah+ " Berhasil" + " saldo sekarang : " + saldo);
        }else{
            System.out.println(namaPemilik + " menarik Rp." + jumlah+ " gagal" + " saldo sekarang : " + saldo);
        }

        System.out.println(" ");
    }
}

public class Main {// class main
    public static void main(String[] args) {// method main
        RekeningBank rekening1 = new RekeningBank("202410370110130", "Farel", 0);// membuat objek rekening1
        RekeningBank rekening2 = new RekeningBank("202410370110131", "wahyu", 5000);// membuat objek rekening2

        rekening1.tampilkanInfo();//memanggil method tampilkanInfo
        rekening2.tampilkanInfo();

        rekening1.setorUang(10000);//memanggil method dan mengirimkan suatu nilai
        rekening2.setorUang(10000);
        System.out.println(" ");
        rekening1.tarikUang(15000);//memanggil method dan mengirimkan suatu nilai
        rekening2.tarikUang(15000);

        rekening1.tampilkanInfo();//memanggil method
        rekening2.tampilkanInfo();
    }
}