package quiz;

public class Main {
    public static void main(String[] args) {
        // Create instances of students and teachers
        Dosen umarTaufiq = new Dosen("Umar Taufiq", 38, "TRPL", "88/888888/SV/88888");
        Dosen rochana = new Dosen("Rochana", 30, "TRPL", "11/222222/SV/33333");
        Mahasiswa revalina = new Mahasiswa("Revalina", 18, "TRPL", "19202020",2023);
        Mahasiswa dina = new Mahasiswa("Dina", 20, "TRPL", "20202020",2023);
        Mahasiswa putri = new Mahasiswa("Putri", 19, "TRE", "21212121",2022);
        Mahasiswa eka = new Mahasiswa("Eka", 20, "TRE", "22222222",2022);

        // Create instances of classes
        Kelas pboClass = new Kelas("SVPLB2PBO", "Senin", 3, umarTaufiq.getNama());
        Kelas pbdClass = new Kelas("SVPLB2PBD", "Senin", 3, rochana.getNama());

    }
}


//public class Dummy.Main {
//    public static void main(String[] args) {
//        Mahasiswa mahasiswaA = new Mahasiswa(;
//
//        Kelas ppbo2 = new Kelas("SVPLB2PBO","PPBO", 3,"Senin");
//        Kelas pbd2 = new Kelas("SVPLB2PBD","PPBD", 3,"Senin");
//        }
//    }
//}