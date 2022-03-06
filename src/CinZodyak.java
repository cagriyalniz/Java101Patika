/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

 */
import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sene;

        System.out.print("Hangi sene dogdunuz : ");
        sene = inp.nextInt();

        if (sene % 12 == 0 ) {
            System.out.print("Zodyağınız : Maymun");
        }else if (sene % 12 == 1) {
            System.out.print("Zodyağınız : Horoz ");

        }else if (sene % 12 == 2) {
            System.out.print("Zodyağınız : Köpek ");

        }else if (sene % 12 == 3) {
            System.out.print("Zodyağınız : Domuz ");

        }else if (sene % 12 == 4) {
            System.out.print("Zodyağınız : Fare ");

        }else if (sene % 12 == 5) {
            System.out.print("Zodyağınız : Öküz ");

        }else if (sene % 12 == 6) {
            System.out.print("Zodyağınız : Kaplan ");

        }else if (sene % 12 == 7) {
            System.out.print("Zodyağınız : Tavşan ");

        }else if (sene % 12 == 8) {
            System.out.print("Zodyağınız : Ejderha ");

        }else if (sene % 12 == 9) {
            System.out.print("Zodyağınız : Yılan ");

        }else if (sene % 12 == 10) {
            System.out.print("Zodyağınız : At ");

        }else if (sene % 12 == 11) {
            System.out.print("Zodyağınız : koyun ");
        }


    }
}
