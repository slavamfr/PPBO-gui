import java.util.Scanner;
// Program ini menggunakan kelas Scanner untuk mendapatkan input dari pengguna,
// sehingga perlu mengimportnya terlebih dahulu.

public class ContohProgram {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        // Pengkondisian if-then
        if (angka > 0) {
            System.out.println("Angka yang dimasukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }
        // Menutup scanner
        scanner.close();
    }
}
