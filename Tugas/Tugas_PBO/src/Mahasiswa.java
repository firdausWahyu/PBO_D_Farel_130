import java.util.Scanner;

class Mahasiswa extends User{
    Scanner sc = new Scanner(System.in);

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    void login(){
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        String nim = sc.nextLine();

        if(nama.equalsIgnoreCase("farel wahyu firdaus") && nim.equals("202410370110130")){
            System.out.println("Login Success \n");
            displayInfo();
        }else {
            System.out.println("Login Failed");
        }
    }

    void displayInfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Kelas : D");
        System.out.println("NIM : "+ getNim());
    }
}
