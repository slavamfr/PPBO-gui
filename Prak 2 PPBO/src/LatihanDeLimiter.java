import java.util.Scanner;
public class LatihanDeLimiter {
    public static  void main(String[] args) {
        Scanner objScanner = new Scanner (System.in).useDelimiter("-");
        System.out.println("Inputkan tiga string yang diikuti - di tiap kata : ");
        System.out.println(objScanner.next());
        System.out.println(objScanner.next());
        System.out.println(objScanner.next());
    }
}


