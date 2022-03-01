/*Java ile kullanıcın seçtiği işlemleri
yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı

Ödev
Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan
metotları yazıp menüde işlevsel hale getiriniz.
 */
import java.util.Scanner;

public class GelismisHesapMakinesi {

    private static void plus(){
        Scanner inp = new Scanner(System.in);
        int nbr = 1, res = 0;

        while(nbr != 0){
            System.out.println("toplanmasini istediginiz sayiyi girniz. bitirmek icin 0 tusuna basiniz");
            nbr = inp.nextInt();
            res += nbr;


        }
        System.out.println("toplama isleminin sonucu: " + res);

    }
    public static void main(String[] args) {

        int flag = 1;
        Scanner calc = new Scanner(System.in);

        while(flag != 0) {
            System.out.println("yapmak istediginiz islemi seciniz: ");
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
            System.out.println(menu);
            flag = calc.nextInt();

            switch (flag){
                case 1:
                    plus();
                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("yanlis bir deger girdiniz");

            }
        }

    }
}
