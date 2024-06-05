import java.util.Scanner;
public class ClassScanner {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.printf("Nama : ");
        String nama = objScanner.nextLine();

        System.out.printf("Prodi : ");
        String prodi = objScanner.nextLine();

        System.out.println("Halo! Saya " + nama + " dari prodi " + prodi);
    }
}
