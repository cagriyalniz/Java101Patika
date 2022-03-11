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
            System.out.println("toplanmasini istediginiz sayiyilari girniz. bitirmek icin 0 tusuna basiniz");
            nbr = inp.nextInt();
            res += nbr;


        }
        System.out.println("toplama isleminin sonucu: " + res);

    }

    private static void minus(){
        Scanner inp = new Scanner(System.in);
        int cikan = 1, res;
        System.out.println("hangi sayidan cikartmak istiyorsunuz");
        res = inp.nextInt();
        while(cikan != 0){
            System.out.println("çıkartmak istediginiz sayiyi girniz. bitirmek icin 0 tusuna basiniz");
            cikan = inp.nextInt();
            res -= cikan;
        }
        System.out.println("cikarma isleminin sonucu: " + res);

    }

    private static void times(){
        Scanner inp = new Scanner(System.in);
        int carpan = 1, res = 1;
        while(carpan != 0){
            System.out.println("carpmak istediginiz sayiyi girniz. bitirmek icin 0 tusuna basiniz");
            carpan = inp.nextInt();
            if (carpan == 0)
                break;
            res *= carpan;
        }
        System.out.println("carpma isleminin sonucu: " + res);

    }

    private static void divided(){
        Scanner inp = new Scanner(System.in);
        int bolen = 1, bolunen = 1;
        System.out.println("bolmek istediginiz sayiyi girniz.");
        bolunen = inp.nextInt();
        while(bolen != 0){
            System.out.println("bolen sayiyi girniz. bitirmek icin 0 tusuna basiniz");
            bolen = inp.nextInt();
            if (bolen == 0){
                System.out.println("hicbir sayi 0'a bolunemez");
                break;
            }
            bolunen /= bolen;
        }
        System.out.println("bolme isleminin sonucu: " + bolunen);

    }

    public static int PowCalc(int nmbr, int pow){
        int res = 1;

        if (pow > 0){
            return (PowCalc(nmbr, pow - 1) * nmbr);
        }
        if (pow == 0)
            return (1);
        res *= nmbr;

        return (res);
    }

    public static void pow(){
        int nmbr, pow;
        Scanner inp = new Scanner(System.in);

        System.out.println("hangi sayinin kuvvetini alacaksiniz: ");
        nmbr = inp.nextInt();
        System.out.println("kacinci kuvvetini alacaksiniz:  ");
        pow = inp.nextInt();
        System.out.println(PowCalc(nmbr, pow));
    }

    public static void fact(){
        Scanner inp = new Scanner(System.in);
        int f, res = 1;

        System.out.println("faktoriyalinin hesaplanmasini istediginiz sayiyi giriniz: ");
        f = inp.nextInt();
        while (f > 0){

            res *= f;
            f--;
        }
        System.out.println("girdiginiz sayinin faktoryeli: " + res);
    }

    public static void mod(){
        Scanner inp = new Scanner(System.in);
        int nmbr, mod, res;

        System.out.println("hangi sayinin modu: ");
        nmbr = inp.nextInt();
        System.out.println("hangi sayiya gore mod: ");
        mod = inp.nextInt();

        res = nmbr % mod;
        System.out.println(nmbr + " sayisinin " + mod + "sayisina gore modu: " + res);

    }

    public static void areaPerimeter(){
        int en, boy;
        Scanner inp = new Scanner(System.in);

        System.out.println("dikdortgenin enini giriniz: ");
        en = inp.nextInt();
        System.out.println("dikdortgenin boyunu giriniz: ");
        boy = inp.nextInt();

        System.out.println("dikdortgenin alani: " + en*boy);
        System.out.println("dikdortgenin cevresi: " + 2*(en + boy));
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
                    case 2:
                        minus();
                        break;
                    case 3:
                        times();
                        break;
                    case 4:
                        divided();
                        break;
                    case 5:
                        pow();
                        break;
                  case 6:
                        fact();
                        break;
                 case 7:
                        mod();
                        break;
                 case 8:
                     areaPerimeter();
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("yanlis bir deger girdiniz");

            }
        }

    }
}
