import java.util.Scanner;
import java.time.LocalDate;



class Mahasiswa{

    public String setjenisKelamin(char jenisKelamin){
        if(jenisKelamin == 'l' || jenisKelamin == 'L'){
            return "Laki-laki";
        }else if(jenisKelamin == 'p' || jenisKelamin == 'P'){
            return "Perempuan";
        }
        return "";
    }

    public int umur(int tahunLahir){
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();
        int umur = thisYear - tahunLahir;
        return umur;
    }

    public  void data(String nama, char jenisKelamin, int tahunLahir){
        System.out.println("Data Diri: ");
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: " + setjenisKelamin(jenisKelamin));
        System.out.println("Umur: "+umur(tahunLahir));

    }


}

public class Main {
    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Jenis Kelamin [P/L] : ");
        char jenisKelamin = sc.next().charAt(0);
        System.out.print("Masukkan Tahun Lahir : ");
        int tahunLahir = sc.nextInt();

        System.out.println(" ");
        data.data(nama, jenisKelamin, tahunLahir);


    }
}