import java.util.Scanner;

public class User {
    private String nama;
    private String nim;
    private Scanner sc;

    public User(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNim(String nama){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    void login(){

    }

    void displayInfo(){

    }
}
