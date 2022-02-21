/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan
bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle
aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.lang.String;
public class PalindromSayi {


    private static int  Basamak(int sayi){
        int bsmk = 0;
        while(sayi > 0){
            sayi = sayi / 10;
            bsmk++;
        }
        return (bsmk);

    }
    private static int @NotNull []ToArray(int sayi2){
        String temp = Integer.toString(sayi2);
        int[] sayi3 = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            sayi3[i] = temp.charAt(i) - '0';
        }
        return sayi3;
    }
    /*private static int Pal(int sayi){

        int bsmk = Basamak(sayi);
        int i = 0;
        int bolme = 0, bolen = 1;
        while(bolme < bsmk){
            bolen *=10;
            bolme++;
        }
        while(i < bsmk/2){
            if(sayi%10 != sayi/bolen)
                return 0;
            else{
                i++;
                sayi = sayi / 10;
                sayi = sayi;
            }
        }
    }*/

    public static void main(String [] args){
        int s1;
        Scanner inp = new Scanner(System.in);

        System.out.print("polindrom oldugunu merak ettiginiz sayiyi giriniz:    ");
        s1 = inp.nextInt();
        System.out.println(ToArray(s1));

    }
}
