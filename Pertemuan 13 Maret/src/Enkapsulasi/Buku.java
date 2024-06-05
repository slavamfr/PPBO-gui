package Enkapsulasi;

public class Buku {
    private String judul;
    private String penulis;
    private boolean isDipinjam;
    private int lamaPeminjaman;
    private User peminjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.isDipinjam = false;
        this.lamaPeminjaman = 0;
    }

    public void pinjam(User admin, User peminjam, int lamaPeminjaman) {
        if (isDipinjam) {
            System.out.println("Buku sedang dipinjam");
        } else if (!admin.getRole().equals("pustakawan")) {
            System.out.println("Perlu izin pustakawan!");
        } else if (peminjam.getBukuDipinjam() != null) {
            System.out.println("Anda sudah meminjam buku lain");
        } else if (lamaPeminjaman <= 0) {
            System.out.println("Lama peminjaman tidak valid");
        } else {
            this.isDipinjam = true;
            this.peminjam = peminjam;
            this.lamaPeminjaman = lamaPeminjaman;
            System.out.println("Buku berhasil dipinjam");
            peminjam.pinjamBuku(this);
        }
    }

    public void kembalikanBuku(User peminjam) {
        if (peminjam == this.peminjam) {
            this.isDipinjam = false;
            this.lamaPeminjaman = 0;
            this.peminjam = null;
            peminjam.kembalikanBuku(this);
        }
    }

    public boolean isDipinjam() {
        return isDipinjam;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public String toString() {
        return "Judul: " + judul +
                "\nPenulis: " + penulis +
                "\nStatus: " + (isDipinjam ? "Sedang dipinjam" : "Tersedia");
    }
}


