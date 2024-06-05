package Masala;

public class Beach extends Destination{

    public Beach(String nama, double jarak, double biayaTransport, double biayaAkomodasi) {
        super(nama, jarak, biayaTransport, biayaAkomodasi);
    }

    @Override
    public double hitungBiayaTransport() {
        if(this.getBiayaTransport()>500000){
         return this.getBiayaTransport()-(this.getBiayaTransport()*0.5);
        }
        return getBiayaTransport();
    }

    @Override
    public double hitungBiayaAkomodasi() {
        return getBiayaAkomodasi();
    }
}
