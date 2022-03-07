/*
Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu
 sayıların en büyük ortak böleni, kısaca EBOB‘u denir.

ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.

18’in bölenleri : 1, 2, 3, 6, 9, 18

24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.

EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu
sayıların en küçük ortak katı, kısaca EKOK‘u denir.

ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.

6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …

8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.

EKOK = (n1*n2) / EBOB

Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */

import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        System.out.println("----------ODEV----------");

        int s1, s2, syc1 = 2, syc2 = 1, ebob = 1, ekok = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("ebobu ve ekoku bulunacak sayilardan birincisini giriniz: ");
        s1 = inp.nextInt();
        System.out.println("ebobu ve ekoku bulunacak sayilardan birincisini giriniz: ");
        s2 = inp.nextInt();

        while(syc1 <= s1 || syc1 <= s2){
            if (s1 % syc1 == 0 && s2 % syc1 == 0)
                ebob = syc1;
            syc1++;
        }
        while(syc2 <= s1*s2){
            if (syc2 % s1 == 0 && syc2 % s2 == 0 ){
                ekok = syc2;
                break;
            }
            syc2++;
        }
        System.out.println("ebobları: " + ebob + " ekokları: " + ekok);

    }
}



