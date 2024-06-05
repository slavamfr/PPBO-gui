import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Dosen umarTaufiq = new Dosen("Umar Taufiq", 38, "TRPL", "123456");
        Dosen rochana = new Dosen("Rochana", 30, "TRPL", "789012");
        Mahasiswa revalina = new Mahasiswa("Revalina", 18, "TRPL", "19202020", 2023);
        Mahasiswa dina = new Mahasiswa("Dina", 20, "TRPL", "20202020", 2023);
        Mahasiswa putri = new Mahasiswa("Putri", 19, "TRE", "21212121", 2022);
        Mahasiswa eka = new Mahasiswa("Eka", 20, "TRE", "22222222", 2022);


        Kelas pboClass = new Kelas("SVPLB2PBO", "PBO", 3, "Senin", umarTaufiq.getNama());
        Kelas pbdClass = new Kelas("SVPLB2PBD", "PBD", 3, "Senin", rochana.getNama());


        enrollStudent(revalina, pboClass);
        enrollStudent(dina, pbdClass);


        System.out.println("Untuk Kelas:");
        printKelasInfo(pboClass);
        printKelasInfo(pbdClass);


        System.out.println("\nUntuk Dosen:");
        printDosenInfo(umarTaufiq);
        printDosenInfo(rochana);


        System.out.println("\nUntuk Mahasiswa:");
        printMahasiswaInfo(revalina);
        printMahasiswaInfo(dina);
        printMahasiswaInfo(putri);
        printMahasiswaInfo(eka);
    }

    public static void enrollStudent(Mahasiswa mahasiswa, Kelas kelas) {

        if (kelas.getDaftarMahasiswa().size() < kelas.getKapasitas()) {

            boolean canEnroll = true;
            for (String kelasYangDiikuti : mahasiswa.getKelasYangDiikuti()) {
                if (kelasYangDiikuti.equals(kelas.getHari())) {
                    canEnroll = false;
                    break;
                }
            }
            if (canEnroll) {

                kelas.tambahMahasiswa(mahasiswa.getNim());
                mahasiswa.enrollKelas(kelas.getKodeKelas());
                System.out.println("Mahasiswa " + mahasiswa.getNama() + " berhasil enroll ke kelas " + kelas.getKodeKelas());
            } else {
                System.out.println("Gagal enroll mahasiswa " + mahasiswa.getNama() + ". Mahasiswa sudah memiliki kelas di hari yang sama.");
            }
        } else {
            System .out.println("Gagal enroll mahasiswa " + mahasiswa.getNama() + ". Kapasitas kelas penuh.");
        }
    }

    public static void printKelasInfo(Kelas kelas) {
        System.out.println("Kelas: " + kelas.getKodeKelas());
        System.out.println("Mata Kuliah: " + kelas.getMataKuliah());
        System.out.println("Kapasitas: " + kelas.getKapasitas());
        System.out.println("Hari: " + kelas.getHari());
        System.out.println("Dosen Pengampu: " + kelas.getDosenPengampu());
        System.out.println("List Mahasiswa: ");
        ArrayList<String> daftarMahasiswa = kelas.getDaftarMahasiswa();
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang enroll.");
        } else {
            for (String nim : daftarMahasiswa) {
                System.out.println("- " + nim);
            }
        }
        System.out.println();
    }

    public static void printDosenInfo(Dosen dosen) {
        System.out.println("Nama Dosen: " + dosen.getNama());
        System.out.println("Prodi: " + dosen.getProdi());
        System.out.println("NIP: " + dosen.getNip());
        System.out.println("Kelas yang Diampu: ");
        ArrayList<String> kelasYangDiampu = dosen.getKelasYangDiampu();
        if (kelasYangDiampu.isEmpty()) {
            System.out.println("Belum mengampu kelas apapun.");
        } else {
            for (String kelas : kelasYangDiampu) {
                System.out.println("- " + kelas);
            }
        }
        System.out.println();
    }

    public static void printMahasiswaInfo(Mahasiswa mahasiswa) {
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Prodi: " + mahasiswa.getProdi());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Angkatan: " + mahasiswa.getAngkatan());
        System.out.println("Kelas Yang Diikuti: ");
        ArrayList<String> kelasYangDiikuti = mahasiswa.getKelasYangDiikuti();
        if (kelasYangDiikuti.isEmpty()) {
            System.out.println("Belum mengikuti kelas apapun.");
        } else {
            for (String kelas : kelasYangDiikuti) {
                System.out.println("- " + kelas);
            }
        }
        System.out.println();
    }
}

