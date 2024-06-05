public class breakLat {
    public static void main(String[] args) {
        int i = 0;
        while (i < 15) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
            i++;
        }
        System.out.println("Selesai");
        for (
                int j = 0;
                j < 20; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }

    }
}
