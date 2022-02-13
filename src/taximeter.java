/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args)
    {
        float km = (float) 2.20, distance = 0.00F, pay = 0.00F;
        int min = 20;
        int start = 10;

        System.out.println("gidilen mesafeyi giriniz: ");
        Scanner inp = new Scanner(System.in);
        distance = inp.nextFloat();

        pay = distance*km + start;

        if(pay < 20)
        {
            pay = 20;
        }

        System.out.println("odenecek ucret: " + pay);


    }
}
