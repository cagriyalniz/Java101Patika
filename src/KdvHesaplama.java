/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin
KDV'li fiyatını ve KDV tutarını
hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
hesaplayan programı yazınız.
 */
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args)
    {
        double money;
        int bin;
        boolean hesaplama;
        double kdv;

        System.out.println("KDV tutarı hesaplanacak para miktarını giriniz: ");

        Scanner inp = new Scanner(System.in);
        money = inp.nextFloat();
        bin = 1000;
        hesaplama = money > bin;
        double azKdv, cokKdv;

        azKdv = money + money*8/100;
        cokKdv = money + money*18/100;
         kdv = hesaplama ? azKdv : cokKdv;
         System.out.println(kdv);





    }
}
