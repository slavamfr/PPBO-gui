import java.util.ArrayList;
class Mahasiswa extends Person {
    private String nim;
    private int angkatan;
    private ArrayList<String> kelasYangDiikuti;

    public Mahasiswa(String nama, int umur, String prodi, String nim, int angkatan) {
        super(nama, umur, prodi);
        this.nim = nim;
        this.angkatan = angkatan;
        this.kelasYangDiikuti = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void enrollKelas(String kelas) {
        kelasYangDiikuti.add(kelas);
    }

    public ArrayList<String> getKelasYangDiikuti() {
        return kelasYangDiikuti;
    }
}