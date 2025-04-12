import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                //admin130
                //password130
                admin.login();
                break;
            case 2:
                //farel wahyu firdaus
                //202410370110130
                mahasiswa.login();
                break;
            default:
                System.out.println("Pilihan Tidak Valid!");
        }

    }
}