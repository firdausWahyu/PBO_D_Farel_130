import java.util.Scanner;

public class Admin {

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
