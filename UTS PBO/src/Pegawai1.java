class Pegawai1 extends Pegawai {
    private double tunjangan;
    private double asuransi = 30;

    // Constructor
    public Pegawai1(String nama, String jabatan, double tunjangan) {
        super(nama, jabatan);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungTunjangan() {
        return tunjangan;
    }

    @Override
    public double hitungGajiTotal() {
        return super.hitungGajiTotal();
    }

    @Override
    public String toString() {
        return super.toString() + "\nGaji Pokok: $" + gajiPokok + "\nAsuransi Kesehatan : $" + asuransi + "\nTunjangan : $" + tunjangan + "\nTotal Bonus: $" + hitungBonus() + "\nGaji Total: $" + hitungGajiTotal();
    }
}