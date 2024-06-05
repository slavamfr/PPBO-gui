// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pegawai1 (Pegawai tetap)
        Pegawai1 pegawai1 = new Pegawai1("Andi", "Manager", 20, 0);

        // Membuat objek Pegawai2 (Pegawai tidak tetap)
        Pegawai2 pegawai2 = new Pegawai2("Budi", "Staff IT");

        // Membuat objek PegawaiPW (Pegawai paruh waktu)
        PegawaiPW pegawaiPW = new PegawaiPW("Cindy", "Sekretaris", 60, 10);

        // Mencetak informasi semua pegawai
        System.out.println("Informasi Pegawai 1:\n" + pegawai1);
        System.out.println("\nInformasi Pegawai 2:\n" + pegawai2);
        System.out.println("\nInformasi Pegawai Paruh Waktu:\n" + pegawaiPW);

        // Mencari pegawai dengan take home pay tertinggi
        Pegawai pegawaiTertinggi = pegawai1;
        if (pegawai2.hitungGajiTotal() > pegawaiTertinggi.hitungGajiTotal()) {
            pegawaiTertinggi = pegawai2;
        }
        if (pegawaiPW.hitungGajiTotal() > pegawaiTertinggi.hitungGajiTotal()) {
            pegawaiTertinggi = pegawaiPW;
        }

        System.out.println("\nPegawai dengan take home pay tertinggi:");
        System.out.println(pegawaiTertinggi.nama + " (" + pegawaiTertinggi.jabatan + ")");
    }
}