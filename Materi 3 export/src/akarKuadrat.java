public class akarKuadrat {
    public static void main(String[] args) {
        double i = 0;
        while (i<20){
            i++;
            double akar = Math.sqrt(i);
            System.out.println("Akar dari bilangan "+i+" adalah "+akar);
            System.out.println("Error : " + (i-akar*akar));
        }
    }
}
