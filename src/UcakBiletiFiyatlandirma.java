/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

import java.util.Scanner;

public class UcakBiletiFiyatlandirma {
    public static void main(String []args)
    {
        int yas, km;
        double ucret;
        String ylclktyp;
        Scanner inp = new Scanner(System.in);

        System.out.println("yolcunun yasini giriniz: ");
        yas = inp.nextInt();
        while (yas < 0){
            System.out.println("yanlis giris yaptiniz");
            System.out.println("yolcunun yasini dogru giriniz!!! ");
            yas = inp.nextInt();

    }
        System.out.println("gidilecek mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();
        while (km < 0 ){
            System.out.println("yanlis giirs yaptiniz");
            System.out.println("gidilecek mesafeyi dogru km cinsinden giriniz!!! ");
            km = inp.nextInt();
        }
        ucret = km*0.1;
        System.out.println("gidis donus icin 'g', tek yon icin 't' giriniz");
        ylclktyp = inp.next();
        while(!ylclktyp.equals("g")  && !ylclktyp.equals("t")){
            System.out.println("yolculuk tipini yanlis sectiniz");
            System.out.println("gidis donus icin 'g', tek yon icin 't' giriniz !!!");
            ylclktyp = inp.next();
        }

        if (yas < 12)
            ucret = ucret*0.5;
        else if (yas >= 12 && yas <= 24)
            ucret = ucret*0.1;
        else if(yas > 65)
            ucret = ucret*0.3;

        if (ylclktyp.equals("g"))
            ucret = ucret*0.2;

        System.out.println("bilet fiyati: " + ucret);
    }
}
