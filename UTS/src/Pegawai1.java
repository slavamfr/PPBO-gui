class Pegawai1 extends Pegawai {
    private double tunjangan;
    private double bonus;

    public Pegawai1(String nama, String jabatan, double tunjangan, double bonus) {
        super(nama, jabatan);
        this.tunjangan = tunjangan;
        this.bonus = bonus;
    }

    @Override
    public double hitungTunjangan() {
        return tunjangan;
    }

    @Override
    public String toString(){
        return super.toString() + "\nGaji Pokok : $" + gajiPokok + "\nBonus: $" + hitungTambahan() + "\nGaji Total: $" + hitungGajiTotal();}
}