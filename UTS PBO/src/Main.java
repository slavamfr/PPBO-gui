public class Main {
    public static void main(String[] args) {
        Pegawai1 pegawai1 = new Pegawai1("Allan", "Manager", 20);

        Pegawai2 pegawai2 = new Pegawai2("Rofi", "Staff IT");

        PegawaiPW pegawaiPW = new PegawaiPW("Daffa", "Sekretaris", 60, 10);

        System.out.println("Informasi Pegawai 1:\n" + pegawai1);
        System.out.println("\nInformasi Pegawai 2:\n" + pegawai2);
        System.out.println("\nInformasi Pegawai Paruh Waktu:\n" + pegawaiPW);

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
