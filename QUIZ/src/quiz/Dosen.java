package quiz;
import java.util.ArrayList;

class Dosen extends Manusia {
    private String nip;
    private ArrayList<String> kelasYangDiampu;

    public Dosen(String nama, int umur, String prodi, String nip) {
        super(nama, umur, prodi);
        this.nip = nip;
        this.kelasYangDiampu = new ArrayList<>();
    }

    public String getNip() {
        return nip;
    }

    public void tambahKelasYangDiampu(String kelas) {
        kelasYangDiampu.add(kelas);
    }

    public ArrayList<String> getKelasYangDiampu() {
        return kelasYangDiampu;
    }

    public static void printTeacherInfo(Dosen dosen) {
        System.out.println("Nama Dosen: " + dosen.getNama());
        System.out.println("Prodi: " + dosen.getProdi());
        System.out.println("NIP: " + dosen.getNip());
        System.out.println("Kelas yang Diampu: " + dosen.getKelasYangDiampu());
        System.out.println();
    }
}
//public class Dosen {
//    String nama;
//    int umur;
//    String nip;
//}
