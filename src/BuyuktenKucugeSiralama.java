/*
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */
import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args)
    {
        int s1, s2, s3, tmp;
        Scanner inp = new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz");
        s1 = inp.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        s2 = inp.nextInt();
        System.out.println("ucuncu sayiyi giriniz");
        s3 = inp.nextInt();

        int i = 0;
        while (i < 3)
        {

            if (s1 < s2){
                tmp = s1;
                s1 = s2;
                s2 = tmp;
            }
            if (s2 < s3){
                tmp = s2;
                s2 = s3;
                s3 = tmp;
            }

            i++;
        }


        System.out.println("buyukten kucuge siralama:  " + s1 + s2 + s3);
    }
}
