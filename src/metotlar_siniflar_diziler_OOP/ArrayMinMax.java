package metotlar_siniflar_diziler_OOP;
/*
Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        System.out.println("-*-*-*-*-*-* ODEV *-*-*-*-*-*-");
        // ust tarafta taminlanan dizinin 5'e en yakin elemanlarina bulduk
        // disaridan alinan degerlerle de yapilabilir
        // altlist ve ustlist icin hafizada fazladan yer acildi
        // bunun onune gecmek icin 5'e kadar ve 5'den sonraki elemanlar saydirilarak
        // iki liste icin yer acilabilirdi
        int altlist[];
        int ustlist[];
        altlist = new int[list.length];
        ustlist = new int[list.length];
        //int k = 0;
        int a = 0;
        for(int k : list){
            if(k < 5){
                altlist[a] = k;
                a++;
            }
        }
        int b = 0;
        for(int t : list){
            if(t > 5){
                ustlist[b] = t;
                b++;
            }
        }

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(altlist));
        System.out.println(Arrays.toString(ustlist));

        int ustMin = ustlist[0];
        int altMax = altlist[0];

        for (int i : ustlist) {
            if (i < ustMin && i != 0) {
                ustMin = i;
            }

        }

        for (int i : altlist) {

            if (i > altMax && i != 0 ) {
                altMax = i;
            }
        }

        System.out.println("min: " + altMax + "   max:  " + ustMin);





    }
}
