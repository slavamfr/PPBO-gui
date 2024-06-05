public class latarray {
    public static void main(String[] args) {
        int baris = 3;
        int kolom = 4;
        int[][] tabel = new int[baris][kolom];
        int counter = 1;
        // Pengisian elemen array menggunakan nested loop
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                tabel[i][j] = counter++;
            }
        }
        // Mencetak elemen array
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(tabel[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//    int [] array1;
//    array1 = new int[3];
//    array1[0] = 3;
//    array1[1] = 3;
//    array1[2] = 3;
//    int jumlah = array1[0] + array1[1] + array1[2];
//    System.out.println("jumlah int di array1 : "+jumlah) ;
// char [] array2 = new char [6];
//    array2[0] = 'b';
//    array2[1] = 'a';
//    array2[2] = 'k';
//    array2[3] = 'S';
//    array2[4] = 'o';
//    array2[5] = 'o';
//    String teks = "" + array2[0] + array2[1] + array2[2] + array2[3] + array2[4] + array2[5];
//    System.out.println("Gabungan char di array2 : "+teks);
//    int [] array3 = {10,20,30,40,50};
//    int [] array4 = new int [] {11,22,33,44,55};
//    System.out.println(Arrays.toString(array3));
//    System.out.println(Arrays.toString(array4));
//    }

