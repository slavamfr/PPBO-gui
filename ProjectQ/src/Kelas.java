import java.util.ArrayList;
class Kelas {
    private String kodeKelas;
    private String mataKuliah;
    private int kapasitas;
    private String hari;
    private String dosenPengampu;
    private ArrayList<String> daftarMahasiswa;

    public Kelas(String kodeKelas, String mataKuliah, int kapasitas, String hari, String dosenPengampu) {
        this.kodeKelas = kodeKelas;
        this.mataKuliah = mataKuliah;
        this.kapasitas = kapasitas;
        this.hari = hari;
        this.dosenPengampu = dosenPengampu;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(String nim) {
        daftarMahasiswa.add(nim);
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String getHari() {
        return hari;
    }

    public String getDosenPengampu() {
        return dosenPengampu;
    }

    public ArrayList<String> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}