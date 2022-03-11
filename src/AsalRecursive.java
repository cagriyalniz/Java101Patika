/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.


 */

import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

import java.util.Scanner;

public class AsalRecursive {

    public static int asalCheck(int nmbr, int i){

        if(i>=nmbr){
            return 1;
        }
        if(nmbr%i==0){
            return 0;
        }
        else return asalCheck(nmbr,i+1);
    }


    public static void main(String[] args) {
        int nmbr, flag;
        Scanner inp = new Scanner(System.in);

        System.out.println("asalligini merak ettiginiz sayiyi giriniz: ");
        nmbr = inp.nextInt();
        flag = asalCheck(nmbr, 2);
        if (flag == 1)
            System.out.println("asal sayiii");
        else
            System.out.println("asal sayi degil");

    }
}
