/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler
kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int y = inp.nextInt();
        int bsmk = y - 1;
        int yldz = 1;
        int yyldz;

        int tbsmk = y ;
        int tyldz = 1;
        int tyyldz;
        int bsmkylz = tbsmk;

        while(tbsmk > 0){

            tyyldz = 2*bsmkylz -1;
            int tbslk = 0;
            while (tyyldz + 2*tbslk < 2*y + 1){
                System.out.print(".");
                tbslk++;

            }


            while(tyyldz  > 0){
                System.out.print("*");
                tyyldz--;
            }

            tyyldz = 2*bsmkylz -1;
            tbslk = 0;
            while (tyyldz + 2*tbslk < 2*y + 1){
                System.out.print(".");
                tbslk++;

            }

            System.out.println();
            tbsmk--;
            bsmkylz--;
            //tyldz += 2;
        }

    }
}
