package Enkapsulasi;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("What is Bro Cooking?", "Chef Slava");
        User pustakawan1 = new User("Tyson Sentinel", "pustakawan");
        User pengunjung1 = new User("Jason Forsaken", "pengunjung");
        User pengunjung2 = new User("Sasha Navi", "pengunjung");

        System.out.println(buku1.isDipinjam());
        buku1.pinjam(pustakawan1,pengunjung1,7);
        buku1.pinjam(pustakawan1, pengunjung2,7);
    }
}
