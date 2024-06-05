class Pegawai2 extends Pegawai {
    private double asuransi = 30;
    public Pegawai2(String nama, String jabatan) {
        super(nama, jabatan);
    }

    @Override
    public double hitungBonus() {
        return 0.04 * gajiPokok;
    }

    @Override
    public double hitungGajiTotal() {
        double gajiTotal = super.hitungGajiTotal();
        double potonganAsuransi = Math.min(gajiTotal * 0.1, 30);
        return gajiTotal - potonganAsuransi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGaji Pokok : $" + gajiPokok + "\nBonus : $" + hitungBonus() + "\nPotongan Asuransi : $" + asuransi + "\nGaji Total : $" + hitungGajiTotal();
    }
}