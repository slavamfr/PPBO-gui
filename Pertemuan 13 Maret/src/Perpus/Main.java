package Perpus;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Bumi", "Tereliye");
        User pustakawan1 = new User("Faiz", "Pustakawan");
        User pengunjung1 = new User("Doni","Pengunjung");
        User pengunjung2 = new User("Doniwan","Pengunjung");
        User pengunjung3 = new User("Doniwu","Pengunjung");

        System.out.println(buku1.isDipinjam());
        buku1.pinjam(pustakawan1, pengunjung1, 7);
    }
}
