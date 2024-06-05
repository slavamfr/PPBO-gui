package Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa teman1 = new Mahasiswa("Emilio", "01 Januari 2005", "Gejayan",
                                            "12345678", "Teknologi Rekayasa Perangkat Lunak");
        Mahasiswa teman2 = new Mahasiswa("Govan", "02 Mei 2005", "Gunung Kidul",
                                            "87654321", "Teknologi Rekaya Perangkat Lunak");

        // Menampilkan informasi teman 1
        System.out.println("Data Teman 1 :");
        teman1.displayInfo();

        System.out.println();

        // Menampilkan informasi teman 2
        System.out.println("Data Teman 2 :");
        teman2.displayInfo();
    }
}

