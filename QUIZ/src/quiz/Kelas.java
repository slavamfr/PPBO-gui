package quiz;
import java.util.ArrayList;

class Kelas {
    private String kodeKelas;
    private String hari;
    private int kapasitasMax;
    private String dosenPengampu;
    private ArrayList<String> daftarMahasiswa;

    public Kelas(String kodeKelas, String hari, int kapasitas, String dosenPengampu) {
        this.kodeKelas = kodeKelas;
        this.hari = hari;
        this.kapasitasMax = kapasitasMax;
        this.dosenPengampu = dosenPengampu;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(String nim) {
        daftarMahasiswa.add(nim);
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public String getHari() {
        return hari;
    }

    public int getKapasitasMax() {
        return kapasitasMax;
    }

    public String getDosenPengampu() {
        return dosenPengampu;
    }

    public ArrayList<String> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public static void enrollStudent(Mahasiswa mahasiswa, Kelas kelas) {
        if (kelas.getKapasitasMax() > kelas.getDaftarMahasiswa().size()) {
            if (!mahasiswa.getKelasYangDiikuti().contains(kelas.getHari())) {
                kelas.tambahMahasiswa(mahasiswa.getNama());
                mahasiswa.enrollKelas(kelas.getKodeKelas());
                System.out.println(mahasiswa.getNama() + " berhasil mendaftar kelas " + kelas.getKodeKelas());
            } else {
                System.out.println(mahasiswa.getNama() + " tidak dapat mendaftar kelas " + kelas.getKodeKelas() +
                        " karena sudah memiliki kelas pada hari yang sama.");
            }
        } else {
            System.out.println("Kelas " + kelas.getKodeKelas() + " penuh, " + mahasiswa.getNama() +
                    " tidak dapat mendaftar.");
        }
    }

    public static void printClassInfo(Kelas kelas) {
        System.out.println("Kelas: " + kelas.getKodeKelas());
        System.out.println("Mata Kuliah: " + getMataKuliahFromKodeKelas(kelas.getKodeKelas()));
        System.out.println("Kapasitas: " + kelas.getKapasitasMax());
        System.out.println("Hari: " + kelas.getHari());
        System.out.println("Dosen Pengampu: " + kelas.getDosenPengampu());
        System.out.println("List Mahasiswa: " + kelas.getDaftarMahasiswa());
        System.out.println();
    }
}



//public class Kelas {
//    String kode;
//    String mataKuliah;
//    int jumlahMahasiswaMax;
//    String hari;
//
//    public Kelas(String kode, String mataKuliah, int jumlahMahasiswaMax, String hari) {
//        this.kode = kode;
//        this.mataKuliah = mataKuliah;
//        this.jumlahMahasiswaMax = jumlahMahasiswaMax ;
//        this.hari = hari;
//    }
//}
