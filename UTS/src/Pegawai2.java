class Pegawai2 extends Pegawai {
    // Constructor
    public Pegawai2(String nama, String jabatan) {
        super(nama, jabatan);
    }

    @Override
    public double hitungTambahan() {
        return 0.04 * gajiPokok;
    }
}