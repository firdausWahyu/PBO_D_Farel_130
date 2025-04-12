import java.util.Scanner;

class Mahasiswa{
    Scanner sc = new Scanner(System.in);
    String nama;
    String nim;

    void login(){
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim = sc.nextLine();

        if(nama.equals("farel wahyu firdaus") && nim.equals("202410370110130")){
            System.out.println("Login Success \n");
            displayInfo();
        }else {
            System.out.println("Login Failed");
        }
    }

    void displayInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : D");
        System.out.println("NIM : "+ nim);
    }
}
