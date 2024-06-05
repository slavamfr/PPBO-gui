package Masala;

public class Main {
    public static void main(String[] args) {
        Beach beach = new Beach("Bali",1000, 500000, 1000000);
        Mountain mountain = new Mountain("Merapi", 500, 750000, 500000);
        City city = new City("Solo", 200, 10000, 5000);

        System.out.println("Jarak: ");
        System.out.println(beach.getNama()+" "+beach.getJarak() + " km");
        System.out.println(mountain.getNama()+ " " +  mountain.getJarak() + " km");
        System.out.println(city.getNama() + " " +city.getJarak() + "km");
        System.out.println(" ");
        System.out.println("Total Biaya : ");
        System.out.println(beach.getNama()+" : "+ (int)beach.getTotalBiaya());
        System.out.println(mountain.getNama()+" : "+ (int)mountain.getTotalBiaya());
        System.out.println(city.getNama()+" : "+(int)city.getTotalBiaya());
    }
}
