/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */
import java.util.Scanner;

public class MinMax {
    private static int max(int s){
        int eski;


        return s;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int adet, min, max, syc = 0, nmbr ;
        min = 0;
        max = 0;
        System.out.println("kac adet sayi gireceksiniz: ");
        adet = inp.nextInt();

        while(syc < adet){
            System.out.println("sayiyi giriniz");
            nmbr = inp.nextInt();
            if (syc == 1) {
                max = nmbr;
                min = nmbr;
            } else {
                if (nmbr >= max)
                    max = nmbr;
                if (nmbr <= min)
                    min = nmbr;
            }
            syc++;
        }
        System.out.println("en buyuk sayi: " + max + " en kucuk sayi: " + min);
    }
}
