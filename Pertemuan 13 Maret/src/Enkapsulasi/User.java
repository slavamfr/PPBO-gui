package Enkapsulasi;

public class User {
    private String nama;
    private String role;
    private Buku bukuDipinjam;

    public User(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }
    public String getNama() {
        return nama;
    }
    public String getRole() {
        return role;
    }
    public Buku getBukuDipinjam() {
        return bukuDipinjam;
    }
    public void pinjamBuku(Buku buku) {
        this.bukuDipinjam = buku;
    }
    public void kembalikanBuku(Buku buku) {
        if (buku == bukuDipinjam) {
            this.bukuDipinjam = null;
        }
    }
}
