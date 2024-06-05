//package Dummy;
//
//import java.util.ArrayList;
//
//class Person {
//    private String nama;
//    private int umur;
//    private String prodi;
//
//    public Person(String nama, int umur, String prodi) {
//        this.nama = nama;
//        this.umur = umur;
//        this.prodi = prodi;
//    }
//
//    // Getter methods
//    public String getNama() {
//        return nama;
//    }
//
//    public int getUmur() {
//        return umur;
//    }
//
//    public String getProdi() {
//        return prodi;
//    }
//}
//
//class Dosen extends Person {
//    private String nip;
//    private ArrayList<String> kelasYangDiampu;
//
//    public Dosen(String nama, int umur, String prodi, String nip) {
//        super(nama, umur, prodi);
//        this.nip = nip;
//        this.kelasYangDiampu = new ArrayList<>();
//    }
//
//    // Getter method for nip
//    public String getNip() {
//        return nip;
//    }
//
//    // Method to add class taught by the teacher
//    public void tambahKelasYangDiampu(String kelas) {
//        kelasYangDiampu.add(kelas);
//    }
//
//    // Getter method for classes taught by the teacher
//    public ArrayList<String> getKelasYangDiampu() {
//        return kelasYangDiampu;
//    }
//}
//
//class Mahasiswa extends Person {
//    private String nim;
//    private ArrayList<String> kelasYangDiikuti;
//
//    public Mahasiswa(String nama, int umur, String prodi, String nim) {
//        super(nama, umur, prodi);
//        this.nim = nim;
//        this.kelasYangDiikuti = new ArrayList<>();
//    }
//
//    // Getter method for nim
//    public String getNim() {
//        return nim;
//    }
//
//    // Method to enroll in a class
//    public void enrollKelas(String kelas) {
//        kelasYangDiikuti.add(kelas);
//    }
//
//    // Getter method for classes taken by the student
//    public ArrayList<String> getKelasYangDiikuti() {
//        return kelasYangDiikuti;
//    }
//}
//
//class Kelas {
//    private String kodeKelas;
//    private String hari;
//    private int kapasitas;
//    private String dosenPengampu;
//    private ArrayList<String> daftarMahasiswa;
//
//    public Kelas(String kodeKelas, String hari, int kapasitas, String dosenPengampu) {
//        this.kodeKelas = kodeKelas;
//        this.hari = hari;
//        this.kapasitas = kapasitas;
//        this.dosenPengampu = dosenPengampu;
//        this.daftarMahasiswa = new ArrayList<>();
//    }
//
//    // Method to add student to class
//    public void tambahMahasiswa(String nim) {
//        daftarMahasiswa.add(nim);
//    }
//
//    // Getter method for class code
//    public String getKodeKelas() {
//        return kodeKelas;
//    }
//
//    // Getter method for day of the class
//    public String getHari() {
//        return hari;
//    }
//
//    // Getter method for class capacity
//    public int getKapasitas() {
//        return kapasitas;
//    }
//
//    // Getter method for teacher of the class
//    public String getDosenPengampu() {
//        return dosenPengampu;
//    }
//
//    // Getter method for list of students enrolled in the class
//    public ArrayList<String> getDaftarMahasiswa() {
//        return daftarMahasiswa;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Create instances of students and teachers
//        Dosen umarTaufiq = new Dosen("Umar Taufiq", 38, "TRPL", "123456");
//        Dosen rochana = new Dosen("Rochana", 30, "TRPL", "789012");
//        Mahasiswa revalina = new Mahasiswa("Revalina", 18, "TRPL", "19202020");
//        Mahasiswa dina = new Mahasiswa("Dina", 20, "TRPL", "20202020");
//        Mahasiswa putri = new Mahasiswa("Putri", 19, "TRE", "21212121");
//        Mahasiswa eka = new Mahasiswa("Eka", 20, "TRE", "22222222");
//
//        // Create instances of classes
//        Kelas pboClass = new Kelas("SVPLB2PBO", "Senin", 3, umarTaufiq.getNama());
//        Kelas pbdClass = new Kelas("SVPLB2PBD", "Senin", 3, rochana.getNama());
//
//        // Enroll students to classes
//        enrollStudent(revalina, pboClass);
//        enrollStudent(dina, pbdClass);

//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        // Create instances of students and teachers
//        Dosen umarTaufiq = new Dosen("Umar Taufiq", 38, "TRPL", "123456");
//        Dosen rochana = new Dosen("Rochana", 30, "TRPL", "789012");
//        Mahasiswa revalina = new Mahasiswa("Revalina", 18, "TRPL", "19202020", 2023);
//        Mahasiswa dina = new Mahasiswa("Dina", 20, "TRPL", "20202020", 2023);
//        Mahasiswa putri = new Mahasiswa("Putri", 19, "TRE", "21212121", 2022);
//        Mahasiswa eka = new Mahasiswa("Eka", 20, "TRE", "22222222", 2022);
//
//        // Create instances of classes
//        Kelas pboClass = new Kelas("SVPLB2PBO", "Senin", 3, umarTaufiq.getNama());
//        Kelas pbdClass = new Kelas("SVPLB2PBD", "Senin", 3, rochana.getNama());
//
//        // Enroll students to classes
//        enrollStudent(revalina, pboClass);
//        enrollStudent(dina, pbdClass);
//
//        // Print class information
//        System.out.println("Informasi Kelas:");
//        System.out.println("=================");
//        printClassInfo(pboClass);
//        printClassInfo(pbdClass);
//
//        // Print teacher information
//        System.out.println("\nInformasi Dosen:");
//        System.out.println("=================");
//        printTeacherInfo(umarTaufiq);
//        printTeacherInfo(rochana);
//
//        // Print student information
//        System.out.println("\nInformasi Mahasiswa:");
//        System.out.println("====================");
//        printStudentInfo(revalina);
//        printStudentInfo(dina);
//        printStudentInfo(putri);
//        printStudentInfo(eka);
//    }
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        // Create instances of students and teachers
//        Dosen umarTaufiq = new Dosen("Umar Taufiq", 38, "TRPL", "123456");
//        Dosen rochana = new Dosen("Rochana", 30, "TRPL", "789012");
//        Mahasiswa revalina = new Mahasiswa("Revalina", 18, "TRPL", "19202020", 2023);
//        Mahasiswa dina = new Mahasiswa("Dina", 20, "TRPL", "20202020", 2023);
//        Mahasiswa putri = new Mahasiswa("Putri", 19, "TRE", "21212121", 2022);
//        Mahasiswa eka = new Mahasiswa("Eka", 20, "TRE", "22222222", 2022);
//
//        // Create instances of classes
//        Kelas pboClass = new Kelas("SVPLB2PBO", "Senin", 3, umarTaufiq.getNama());
//        Kelas pbdClass = new Kelas("SVPLB2PBD", "Senin", 3, rochana.getNama());
//
//        // Enroll students to classes
//        enrollStudent(revalina, pboClass);
//        enrollStudent(dina, pbdClass);
//
//        // Print class information
//        System.out.println("Informasi Kelas:");
//        System.out.println("=================");
//        printClassInfo(pboClass);
//        printClassInfo(pbdClass);
//
//        // Print teacher information
//        System.out.println("\nInformasi Dosen:");
//        System.out.println("=================");
//        printTeacherInfo(umarTaufiq);
//        printTeacherInfo(rochana);
//
//        // Print student information
//        System.out.println("\nInformasi Mahasiswa:");
//        System.out.println("====================");
//        printStudentInfo(revalina);
//        printStudentInfo(dina);
//        printStudentInfo(putri);
//        printStudentInfo(eka);
//    }
//
//    // Method to enroll student to class
//    public static void enrollStudent(Mahasiswa mahasiswa, Kelas kelas) {
//        if (kelas.getKapasitas() > kelas.getDaftarMahasiswa().size()) {
//            if (!mahasiswa.getKelasYangDiikuti().contains(kelas.getHari())) {
//                kelas.tambahMahasiswa(mahasiswa.getNama());
//                mahasiswa.enrollKelas(kelas.getKodeKelas());
//                System.out.println(mahasiswa.getNama() + " berhasil mendaftar kelas " + kelas.getKodeKelas());
//            } else {
//                System.out.println(mahasiswa.getNama() + " tidak dapat mendaftar kelas " + kelas.getKodeKelas() +
//                        " karena sudah memiliki kelas pada hari yang sama.");
//            }
//        } else {
//            System.out.println("Kelas " + kelas.getKodeKelas() + " penuh, " + mahasiswa.getNama() +
//                    " tidak dapat mendaftar.");
//        }
//    }
//
//    // Method to print class information
//    public static void printClassInfo(Kelas kelas) {
//        System.out.println("Kelas: " + kelas.getKodeKelas());
//        System.out.println("Mata Kuliah: " + getMataKuliahFromKodeKelas(kelas.getKodeKelas()));
//        System.out.println("Kapasitas: " + kelas.getKapasitas());
//        System.out.println("Hari: " + kelas.getHari());
//        System.out.println("Dosen Pengampu: " + kelas.getDosenPengampu());
//        System.out.println("List Mahasiswa: " + kelas.getDaftarMahasiswa());
//        System.out.println();
//    }
//
//    // Method to print teacher information
//    public static void printTeacherInfo(Dosen dosen) {
//        System.out.println("Nama Dosen: " + dosen.getNama());
//        System.out.println("Prodi: " + dosen.getProdi());
//        System.out.println("NIP: " + dosen.getNip());
//        System.out.println("Kelas yang Diampu: " + dosen.getKelasYangDiampu());
//        System.out.println();
//    }
//
//    // Method to print student information
//    public static void printStudentInfo(Mahasiswa mahasiswa) {
//        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
//        System.out.println("Prodi: " + mahasiswa.getProdi());
//        System.out.println("NIM: " + mahasiswa.getNim());
//        System.out.println("Angkatan: " + mahasiswa.getAngkatan());
//        System.out.println("Kelas Yang Diikuti: " + mahasiswa.getKelasYangDiikuti());
//        System.out.println();
//    }
//
//    // Method to get subject from class code
//    public static String getMataKuliahFromKodeKelas(String kodeKelas) {
//        if (kodeKelas.equals("SVPLB2PBO")) {
//            return "PBO";
//        } else if (kodeKelas.equals("SVPLB2PBD")) {
//            return "PBD";
//        } else {
//            return "Unknown";
//        }
//    }
//}



//    // Method to enroll student to class
//    public static void enrollStudent(Mahasiswa mahasiswa, Kelas kelas) {
//        if (kelas.getKapasitas() > kelas.getDaftarMahasiswa().size()) {
//            if (!mahasiswa.getKelasYangDiikuti().contains(kelas.getHari())) {
//                kelas.tambahMahasiswa(mahasiswa.getNama());
//                mahasiswa.enrollKelas(kelas.getKodeKelas());
//                System.out.println(mahasiswa.getNama() + " berhasil mendaftar kelas " + kelas.getKodeKelas());
//            } else {
//                System.out.println(mahasiswa.getNama() + " tidak dapat mendaftar kelas " + kelas.getKodeKelas() +
//                        " karena sudah memiliki kelas pada hari yang sama.");
//            }
//        } else {
//            System.out.println("Kelas " + kelas.getKodeKelas() + " penuh, " + mahasiswa.getNama() +
//                    " tidak dapat mendaftar.");
//        }
//    }
//
//    // Method to print class information
//    public static void printClassInfo(Kelas kelas) {
//        System.out.println("Kelas: " + kelas.getKodeKelas());
//        System.out.println("Mata Kuliah: " + getMataKuliahFromKodeKelas(kelas.getKodeKelas()));
//        System.out.println("Kapasitas: " + kelas.getKapasitas());
//        System.out.println("Hari: " + kelas.getHari());
//        System.out.println("Dosen Pengampu: " + kelas.getDosenPengampu());
//        System.out.println("List Mahasiswa: " + kelas.getDaftarMahasiswa());
//        System.out.println();
//    }
//
//    // Method to print teacher information
//    public static void printTeacherInfo(Dosen dosen) {
//        System.out.println("Nama Dosen: " + dosen.getNama());
//        System.out.println("Prodi: " + dosen.getProdi());
//        System.out.println("NIP: " + dosen.getNip());
//        System.out.println("Kelas yang Diampu: " + dosen.getKelasYangDiampu());
//        System.out.println();
//    }
//
//    // Method to print student information
//    public static void printStudentInfo(Mahasiswa mahasiswa) {
//        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
//        System.out.println("Prodi: " + mahasiswa.getProdi());
//        System.out.println("NIM: " + mahasiswa.getNim());
//        System.out.println("Angkatan: " + mahasiswa.getAngkatan());
//        System.out.println("Kelas Yang Diikuti: " + mahasiswa.getKelasYangDiikuti());
//        System.out.println();
//    }

    // Method to get subject from class code
//    public static String getMataKuliahFromKodeKelas(String kodeKelas) {
//        if (kodeKelas.equals("SVPLB2PBO")) {
//            return "PBO";
//        } else if (kodeKelas.equals("SVPLB2PBD")) {
//            return "PBD";
//        } else {
//            return "Unknown";
//        }
//    }
//}

