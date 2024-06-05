package Tugas;

// Abstract class Orang
abstract class Orang {
    private String nama;
    private String tanggalLahir;
    private String alamat;

    // Constructor
    public Orang(String nama, String tanggalLahir, String alamat) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstract Method
    public abstract void displayInfo();
}