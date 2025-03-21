class KarakterGame{
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return nama;
    }

    void setKesehatan(int kesehatan){
        this.kesehatan = kesehatan;
    }

    int getKesehatan(){
        return kesehatan;
    }

    void serang(KarakterGame target){
        System.out.println(nama + " Menyerang " + target.getNama());
    }
}

class Pahlawan extends KarakterGame{
    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target){
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame{
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target){
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}



public class Main {
    public static void main(String[] args) {
        KarakterGame karakterGame = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        System.out.println("Status : ");
        System.out.println(pahlawan.getNama()+ " Memiliki Kesehatan : "+pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + "Memiliki Kesehatan : "+musuh.getKesehatan());

        pahlawan.serang(musuh);
        musuh.serang(pahlawan);
    }
}