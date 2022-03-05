/*
ava dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */

import java.util.Scanner;

public class RecursivePow {

    public static int Pow(int nmbr, int pow){
        int res = 1;

        if (pow > 0){
            return (Pow(nmbr, pow - 1) * nmbr);
        }
        if (pow == 0)
            return (1);
        res *= nmbr;

        return (res);
    }
    public static void main(String[] args) {

        int nmbr, pow;
        Scanner inp = new Scanner(System.in);

        System.out.println("sayiyi giriniz: ");
        nmbr = inp.nextInt();
        System.out.println("kacinci kuvveti olsun? ");
        pow = inp.nextInt();

        System.out.println("sonuc: " + Pow(nmbr, pow));



    }
}
