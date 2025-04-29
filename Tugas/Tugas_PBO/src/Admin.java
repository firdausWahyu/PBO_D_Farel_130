import java.util.Scanner;

public class Admin extends User{

        Scanner sc = new Scanner(System.in);
        private String username;
        private String password;

    public Admin(String username, String password, String nama, String nim) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    @Override
        void login(){
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan password: ");
            String password = sc.nextLine();

            if(username.equals("admin130") && password.equals("password130")){
                System.out.println("Login Success");
            }else {
                System.out.println("Login Failed");
            }
        }
    @Override
        void displayInfo(){
            System.out.println("Login Sukses!");
        }
}
