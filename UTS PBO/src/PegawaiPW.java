class PegawaiPW extends Pegawai {
    private int jamKerja;
    private double tarifPerJam;

    public PegawaiPW(String nama, String jabatan, int jamKerja, double tarifPerJam) {
        super(nama, jabatan);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGajiTotal() {
        return jamKerja * tarifPerJam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGaji per Jam: $" + tarifPerJam + "\nJumlah Jam Kerja: " + jamKerja + " jam" + "\nGaji Total: $" + hitungGajiTotal();
    }
}
