//import java.util.Scanner;
//public class GallontoLiter{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan berapa gallon : ");
//        int angka = scanner.nextInt();
//        int hasil = (int) (angka * 3.7854);
//        System.out.println("Jadi " + angka + " Galon " + "adalah " + hasil + " Liter.");
//        scanner.close();
//    }
//}

public class GallontoLiter {
    public static void main(String[] args) {
        double jumlahGallon = 10;
        final double GALLON_TO_LITER = 3.7854;

        double jumlahLiter = jumlahGallon * GALLON_TO_LITER;

        System.out.println("Jumlah gallon: " + jumlahGallon);
        System.out.println("Konversi ke liter: " + jumlahLiter);
    }
}

