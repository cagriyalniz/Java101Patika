/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
hesaplayan programı yazınız.
 */
import java.util.Scanner;
public class TekCift {
    public static void main(String [] args)
    {
        int nmbr1, nmbr2, syc = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("cift olan sayilari gostermek icin sayi giriniz: ");
        nmbr1 = inp.nextInt();
        while (nmbr1 >= syc)
        {
            if (syc % 2 == 0) {
                System.out.println(syc + " sayisi cift sayi");
            }
            syc++;
        }
        System.out.println("3 ve 4 e tam bolunebilen sayilarin ortlamasi icin sayi giriniz: ");
        nmbr2 = inp.nextInt();
        syc = 1;
        int b = 0;
        int res = 0;
        while (syc <= nmbr2)
        {
            if (syc % 3 == 0 && syc % 4 == 0 ) {
                res += syc;
                b++;
            }
            syc++;
        }
        System.out.println("ortalama: " + res/b);

    }
}
