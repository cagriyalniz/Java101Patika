/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini
ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28 1 2 4 7 14
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
 */

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int nbr, yNbr, syc = 1, res = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("sayiyi giriniz: ");
        nbr = inp.nextInt();
        yNbr = nbr;
        while(syc < yNbr){
            if (yNbr % syc == 0) {
                res += syc;
            }
            syc++;
        }
        if (res == nbr)
            System.out.println("Perfect!!");
        else
            System.out.println("loser");


    }
}
