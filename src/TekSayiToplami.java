/*
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

---BONUS---
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String [] args){

        int s1, toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Negatif giris yapana kadar sayi girisi yapiniz");
        s1 = inp.nextInt();
        while (s1>=0){
            if (s1 % 2 != 0){
            toplam = toplam + s1;
            }
            System.out.println("Sayi girisi yapiniz");
            s1 = inp.nextInt();
        }
        System.out.println("tek sayilarin toplami: " + toplam);

        System.out.println("----BONUS---");
        toplam = 0;
        s1 = 0;
        System.out.println("tek sayi girisi yapana kadar sayi girisi yapiniz");
        s1 = inp.nextInt();
        while (s1 %2 ==0){
            if (s1 %4 == 0){
                toplam = toplam + s1;
            }
            System.out.println("Sayi girisi yapiniz");
            s1 = inp.nextInt();
        }
        System.out.println("cift ve dortun kati olan sayilarin toplami: " + toplam);
    }
}
