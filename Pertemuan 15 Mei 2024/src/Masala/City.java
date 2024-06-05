package Masala;

public class City extends Destination{
    public City(String nama, double jarak, double biayaTransport, double biayaAkomodasi) {
        super(nama, jarak, biayaTransport, biayaAkomodasi);
    }

    @Override
    public double hitungBiayaTransport() {
        return getBiayaTransport();
    }

    @Override
    public double hitungBiayaAkomodasi() {
        return getBiayaAkomodasi();}
}
