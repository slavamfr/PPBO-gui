package Masala;

public class Mountain extends Destination{

    public Mountain(String nama, double jarak, double biayaTransport, double biayaAkomodasi) {
        super(nama, jarak, biayaTransport, biayaAkomodasi);
    }

    @Override
    public double hitungBiayaTransport() {
        return getBiayaTransport();
    }

    @Override
    public double hitungBiayaAkomodasi() {
        if (getBiayaAkomodasi()>500000){
            return getTotalBiaya()*0.95;
        } else {
        return getBiayaAkomodasi();}
    }
}
