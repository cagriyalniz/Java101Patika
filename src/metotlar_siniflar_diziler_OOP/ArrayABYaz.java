package metotlar_siniflar_diziler_OOP;

/*
Ödev
Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.

 *  *  *  *
 *        *
 *        *
 *  *  *  *
 *        *
 *        *
 *  *  *  *
 */

public class ArrayABYaz {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("-----***** ODEV *****-----");

        String[][] letter2 = new String[7][4];

        for (int i=0; i<letter2.length; i++) {
            for (int j=0; j<letter2[i].length; j++) {

                if (i==0 || i==3 || i==6) {
                    letter2 [i][j] = " * ";
                }

                else if (j==0 || j==3) {
                    letter2 [i][j] = " * ";
                }

                else {
                    letter2 [i][j] = "   ";
                }
            }
        }

        for (String[] row : letter2 ) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
