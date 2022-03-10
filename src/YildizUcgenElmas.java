/*
Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

     *
    ***
   *****
  *******
 *********
***********

ODEV:

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

public class YildizUcgenElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("   ODEV   ");
        //(5)1(5)-(4)3(4)-(3)5(3)-(2)7(2)-(1)9(1)-(2)7(2)-(3)5(3)-(4)3(4)-(5)1(5)
        //yldz: 1*2 -1  2*2 -1 3*2 -1 4*2 -1 5*2 -1
        System.out.println("Bir Sayı Giriniz :");
        int y = inp.nextInt();
        int bsmk = y - 1;
        int yldz = 1;
        int yyldz;

        int tbsmk = y - 1 ;
        int tyldz = 1;
        int tyyldz;


        while(bsmk > 0){

            int bslk = bsmk;
            while (bslk > 0){
                System.out.print(".");
                bslk--;
            }

            yyldz = yldz;
            while(yyldz*2 - 1 > 0){
                System.out.print("*");
                yyldz--;
            }

            bslk = bsmk;
            while (bslk > 0){
                System.out.print(".");
                bslk--;
            }
            System.out.println();
            bsmk--;
            yldz += 2;
        }

        int ara = 2*y - 1;
        while(ara > 0){
            System.out.print("*");
            ara--;
        }
        System.out.println();

        int bsmkylz = tbsmk;
        while(tbsmk > 0){

            tyyldz = 2*bsmkylz -1;
            int tbslk = 1;
            while (tyyldz + 2*tbslk < 2*y + 1){
                System.out.print(".");
                tbslk++;

            }


            while(tyyldz  > 0){
                System.out.print("*");
                tyyldz--;
            }

            tyyldz = 2*bsmkylz -1;
            tbslk = 1;
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
