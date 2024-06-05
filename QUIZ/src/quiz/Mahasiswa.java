package quiz;

import java.util.ArrayList;

class Mahasiswa extends Manusia {
    private String nim;
    private ArrayList<String> kelasYangDiikuti;
    private int angkatan;

    public Mahasiswa(String nama, int umur, String prodi, String nim, int angkatan) {
        super(nama, umur, prodi);
        this.nim = nim;
        this.kelasYangDiikuti = new ArrayList<>();
        this.angkatan = angkatan;
    }

    public String getNim() {
        return nim;
    }

    public void enrollKelas(String kelas) {
        kelasYangDiikuti.add(kelas);
    }

    public ArrayList<String> getKelasYangDiikuti() {
        return kelasYangDiikuti;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public static void printStudentInfo(Mahasiswa mahasiswa) {
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Prodi: " + mahasiswa.getProdi());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Angkatan: " + mahasiswa.getAngkatan());
        System.out.println("Kelas Yang Diikuti: " + mahasiswa.getKelasYangDiikuti());
        System.out.println();
    }
}
//
//Buat agar dapat menghasilkan print :
//
//Untuk kelas :
//Kelas
//Mata Kuliah
//Kapasitas
//Hari
//Dosen Pengampu
//List Mahasiswa
//
//Untuk Dosen :
//Nama Dosen
//Prodi
//NIP
//Kelas yang diampu
//
//Untuk Mahasiswa :
//Nama Mahasiswa
//Prodi
//NIM
//Angkatan
//Kelas Yang DiIkuti
//public class Mahasiswa {
//    int umur;
//    String nim;
//    int angkatan;
//    String prodi;
//
//    public String getNama() {
//        return this.nim;
//    }
//
//    public String getRole() {
//        return this.prodi;
//    }
//}
