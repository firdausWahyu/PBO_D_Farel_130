package perpustakaan;

public class Anggota implements peminjaman{
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }


    @Override
    public void pinjamBuku(Buku buku) {
        System.out.println(nama+ " meminjam buku berjudul :"+ buku.judul);
    }

    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama+ " meminjam buku berjudul :"+ judul + "selama " + durasi);
    }

    @Override
    public void kembalikanBuku(Buku buku) {
        System.out.println(nama+ " meminjam buku berjudul :"+ buku.judul);
    }

    public void kembalikanBuku(String judul){
        System.out.println(nama+ " meminjam buku berjudul :"+ judul);
    }

    public void displayInfo(){
        System.out.println("Anggota : "+nama+ "("+ idAnggota+")");
    }
}
