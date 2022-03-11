/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki
kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar
5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16


N Sayısı : 10
Çıktısı : 10 5 0 5 10
 */

import java.util.Scanner;

public class RecursivePattern {

    public static void pattern(int dsn, int desen, int flag){
        int ndsn, arti;
        System.out.print(dsn + " ");


        if (dsn > 0 && flag == 0){
            ndsn = dsn - 5;
            pattern(ndsn, desen, 0 );
        }
        else if(dsn <= 0 || flag == 1){
            flag = 1;
                if (dsn < desen) {
                    ndsn = dsn + 5;
                    pattern(ndsn, desen, flag);
                }
        }


    }

    public static void main(String[] args) {
        int dsn;
        Scanner inp = new Scanner(System.in);

        System.out.println("desen olusturacaginiz sayiyi giriniz: ");
        dsn = inp.nextInt();
        pattern(dsn, dsn, 0);

    }
}
