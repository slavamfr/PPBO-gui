class Pegawai {
    protected String nama;
    protected String jabatan;
    protected double gajiPokok = 550.0;

    // Constructor
    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public double hitungTambahan() {
        return 0.04 * (gajiPokok + hitungTunjangan());
    }

    public double hitungTunjangan() {
        return 0;
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungTambahan();
    }

    public String toString() {
        return "Nama: " + nama + "\nJabatan: " + jabatan;
    }
}
