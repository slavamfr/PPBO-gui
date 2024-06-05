import java.util.ArrayList;

class Person {
    private String nama;
    private int umur;
    private String prodi;

    public Person(String nama, int umur, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getProdi() {
        return prodi;
    }
}