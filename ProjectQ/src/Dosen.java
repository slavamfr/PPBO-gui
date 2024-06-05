import java.util.ArrayList;
class Dosen extends Person {
    private String nip;
    private ArrayList<String> kelasYangDiampu;

    public Dosen(String nama, int umur, String prodi, String nip) {
        super(nama, umur, prodi);
        this.nip = nip;
        this.kelasYangDiampu = new ArrayList<>();
    }

    public String getNip() {
        return nip;
    }

    public void tambahKelasYangDiampu(String kelas) {
        kelasYangDiampu.add(kelas);
    }

    public ArrayList<String> getKelasYangDiampu() {
        return kelasYangDiampu;
    }
}