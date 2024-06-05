package Tugas;

class Mahasiswa extends Orang {
    private String nim;
    private String prodi;

    public Mahasiswa(String nama, String tanggalLahir, String alamat, String nim, String prodi) {
        super(nama, tanggalLahir, alamat);
        this.nim = nim;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Menampilkan informasi Mahasiswa
    public void displayInfo() {
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + nim);
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("Program Studi : " + prodi);
        System.out.println("Alamat : " + getAlamat());
    }
}

