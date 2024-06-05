package Perpus;

public class Buku {
    String judul;
    String penulis;
    boolean isDipinjam;
    User peminjam;
    int lamaPeminjaman;

    public Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
        this.isDipinjam = false;
        this.lamaPeminjaman = 0;
    }
    public void pinjam(User admin, User peminjam, int lamaPeminjaman) {
        if (isDipinjam == true) {
            System.out.println("Buku Sedang diPinjam");
        } else if (!admin.role.equals("Pustakawan")){
            System.out.println("Perlu Izin Pustakawan");
        } else {
            isDipinjam = true;
            this.peminjam = peminjam;
            this.lamaPeminjaman = lamaPeminjaman;
            System.out.println("Buku Berhasil Dipinjam ");
        }
    }
    public boolean isDipinjam() {
        return this.isDipinjam;
    }
}
