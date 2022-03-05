/*
Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine
eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye
eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 */

import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int nmbr, n, bsmk = 0;

        System.out.println("Armstrong olup olmadigini merak ettiginiz sayiyi giriniz: ");
        nmbr = inp.nextInt();

        //sayinin basamagini bulma
        n = nmbr;
        while(n > 0){
            n /= 10;
            bsmk++;
        }
        //basamak kontrol
        //System.out.println("basamak: " + bsmk);
        int bsmk2 = bsmk;
        //us bulma ve toplama
        n = nmbr;
        int eleman, toplam = 0,  res;
        while(n> 0){
            eleman = n % 10;
            bsmk2 = bsmk;
            res = eleman;
            while (bsmk2 > 1){
                res *= eleman;
                bsmk2--;
            }
            toplam += res;
            n /= 10;
        }

        if (nmbr == toplam){
            System.out.println("girdiginiz sayi Armstrong bir sayi");
        }
        else
            System.out.println("girdiginiz sayi Armstron bir sayi degil");

    }
}
