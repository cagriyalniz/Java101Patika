/*
Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz
 */
package metotlar_siniflar_diziler_OOP;

import java.util.Arrays;
public class ArrayTekrarliSayilar {
    static boolean checknbr(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return false;
            }

        }return true;
    }

    public static void main(String[] args) {
        int[] arr = {100, 3, 4, 4, 5, 3, 100, 44, 2, 0, 44, 100 };
        int[] tekrarArr =new int[arr.length];
        int indeks=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j< arr.length;j++){
                if((i!=j) && arr[i]==arr[j] && arr[i]%2==0){
                    if (checknbr(tekrarArr,arr[i])){
                        tekrarArr[indeks]= arr[i];
                        indeks++;
                    }

                }
            }
        }
        System.out.println("tekrar eden sayilar: ");
        int t = 0;
        while(t < tekrarArr.length){
            if (tekrarArr[t] != 0){
                System.out.println(tekrarArr[t]);
            }
            t++;
        }


    }
}
