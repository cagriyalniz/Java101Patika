package metotlar_siniflar_diziler_OOP;

/*Dizideki Elemanların Ortalamasını Hesaplayan Program

        Ödev
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        Harmonik Seri Formülü : 1 + 1/2 + 1/3 ...... + 1/n
*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAvarage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("ortalama:" + sum / numbers.length);

        sum = 0;
        for (int j : numbers2 ){
            sum+= j;
        }
        System.out.println("foreach ile ortalama: " + sum / numbers2.length);

        System.out.println("-----------ODEV----------");

        //elemanlarin carpimi
        int i = 0;
        double hOrt;
        sum = 0;
        while(i < numbers.length){
            sum = sum + (1/numbers[i]);
            i++;
        }

        hOrt = numbers.length / sum;

        System.out.println("Harmonik Ortalama: " + hOrt);
    }
}

