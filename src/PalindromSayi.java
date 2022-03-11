/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan
bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle
aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
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
    private static int []ToArray(int sayi2){
        String temp = Integer.toString(sayi2);
        int[] sayi3 = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            sayi3[i] = temp.charAt(i) - '0';
        }
        return sayi3;
    }
    private static void Pal(int[] sayi, int len, int flag){

        int i = 0, snElemn = len - 1, checkFlag = 1;
        if (flag == 0){
            while(i < snElemn/2){
                if (sayi[i] != sayi[snElemn]){
                    System.out.println("Palindrom degil!!!!!!!!");
                    checkFlag = 0;
                    break;
                }
                else{
                    i++;
                    snElemn--;
                }

            }

        }
        else{
            while(i < len/2){
                if (sayi[i] != sayi[snElemn]){
                    System.out.println("Palindrom degil!!!!!!!!");
                    checkFlag = 0;
                    break;
                }
                else{
                    i++;
                    snElemn--;
                }
            }

        }

        if (checkFlag == 1)
            System.out.println("bu sayi palindrom !!!!*!*!**!!");

    }

    public static void main(String [] args){
        int s1, len, flag;
        Scanner inp = new Scanner(System.in);

        System.out.print("polindrom oldugunu merak ettiginiz sayiyi giriniz:    ");
        s1 = inp.nextInt();
        len = Basamak(s1);
        if (len % 2 == 0)
            flag = 0;
        else
            flag = 1;
        int []s2 = new int[len];
        s2 = ToArray(s1);
        System.out.println(Arrays.toString(s2));

        Pal(s2, len, flag);

    }
}
