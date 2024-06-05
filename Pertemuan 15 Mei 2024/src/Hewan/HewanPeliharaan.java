package Hewan;

//untuk mengaubah menjadi abstract tambahkan abstract pada public class
public abstract class HewanPeliharaan {
    private String nama;
    private String warnaDominan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarnaDominan(){
        return warnaDominan;
    }

    public void setWarnaDominan(String warnaDominan) {
        this.warnaDominan = warnaDominan;
    }

    public abstract void bergerak();
    public abstract void bersuara();

}
