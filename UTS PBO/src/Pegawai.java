class Pegawai {
    protected String nama;
    protected String jabatan;
    protected double gajiPokok = 550.0;

    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public double hitungBonus() {
        return 0.04 * (gajiPokok + hitungTunjangan());
    }

    public double hitungTunjangan() {
        return 0;
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungBonus();
    }

    public String toString() {
        return "Nama: " + nama + "\nJabatan: " + jabatan;
    }
}