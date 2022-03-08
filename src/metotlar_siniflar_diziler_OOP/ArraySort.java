/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
 */
package metotlar_siniflar_diziler_OOP;

import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {

        int byt, i = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("dizinin boyutunu giriniz: ");
        byt = inp.nextInt();
        int[] arr = new int[byt];

        while(i < byt){
            System.out.println("dizinin " + (i+1) + "numarali elemanini giriniz:");
            arr[i] = inp.nextInt();
            i++;
        }

        for (int k = 0; k < arr.length; k++)
        {
            for (int j = k + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[k] > arr[j])
                {
                    tmp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[k]);
        }
    }
}





