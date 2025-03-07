import java.util.Scanner;

class Admin {
    Scanner sc = new Scanner(System.in);
    String username;
    String password;

    void login(){
        System.out.print("Masukkan username: ");
        username = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();

        if(username.equals("admin130") && password.equals("password130")){
            System.out.println("Login Success");
        }else {
            System.out.println("Login Failed");
        }
    }

}

class Mahasiswa{
    Scanner sc = new Scanner(System.in);
    String username;
    String password;

    void login(){
        System.out.print("Masukkan username: ");
        username = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();

        if(username.equals("farel wahyu firdaus") && password.equals("202410370110130")){
            System.out.println("Login Success");
        }else {
            System.out.println("Login Failed");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin : ");
        System.out.println("2. Mahasiswa : ");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                admin.login();
                break;
            case 2:
                //202410370110130
                //farel wahyu firdaus
                mahasiswa.login();
                break;
            default:
                System.out.println("Pilihan Tidak Valid!");
        }

    }
}