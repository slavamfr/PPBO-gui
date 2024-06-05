//hitung faktorial dari 5
public class FaktorialFor {
    public static void main(String[] args) {
        int hasil = 1;
        for (int i = 1; i <= 5; i++) {
            hasil = hasil * i;
        }
        System.out.println(hasil);
    }
}
