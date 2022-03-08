/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini
yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */

package metotlar_siniflar_diziler_OOP;

public class ArrayFreq {
    public static void main(String[] args) {

    int  arr[] = {0, 11, 22, 44, 22, 4, 66, 4, 7, 88, 12};
    int i = -21474836, j, syc = 0;
    //int min: -2147483648
        // int max: 2147483647
    while(i < 21474836){

        j = 0;
        syc = 0;
        while(j < arr.length){
            if (arr[j] == i){

                syc++;
            }
            j++;
        }
        if (syc != 0)
            System.out.println(i + "elemanindan " + syc + " tane var");
        i++;
    }



    }
}
