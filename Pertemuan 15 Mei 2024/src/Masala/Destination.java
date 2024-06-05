package Masala;

public abstract class Destination {
    private String nama;
    private double jarak;
    private double biayaTransport;
    private double biayaAkomodasi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public double getBiayaTransport() {
        return biayaTransport;
    }

    public void setBiayaTransport(double biayaTransport) {
        this.biayaTransport = biayaTransport;
    }

    public double getBiayaAkomodasi() {
        return biayaAkomodasi;
    }

    public void setBiayaAkomodasi(double biayaAkomodasi) {
        this.biayaAkomodasi = biayaAkomodasi;
    }

    public Destination(String nama, double jarak, double biayaTransport, double biayaAkomodasi){
        this.nama = nama;
        this.jarak = jarak;
        this.biayaTransport = biayaTransport;
        this.biayaAkomodasi = biayaAkomodasi;
    }

    public abstract double hitungBiayaTransport();
    public abstract double hitungBiayaAkomodasi();

    public double getTotalBiaya() {
        double totalBiaya = biayaAkomodasi+biayaTransport;
        if (jarak > 1000) {
            totalBiaya *= 0.9;
        }
        return totalBiaya;
    }


}
