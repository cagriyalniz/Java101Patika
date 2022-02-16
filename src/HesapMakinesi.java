import java.util.Scanner;
/*
switch case kullanarak hesap makinesi yapma
 */
public class HesapMakinesi {
    public static void main(String [] args)
    {

        int nmbr1, nmbr2, calculation;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        nmbr1 = input.nextInt();
        System.out.print("İkinci Sayııyı Giriniz : ");
        nmbr2 = input.nextInt();


        System.out.println("Toplama için: 1\nÇıkartma için: 2\nÇarpma için: 3\nBölme için: 4");
        System.out.print("Seçiminiz : ");
        calculation = input.nextInt();

        switch (calculation) {
            case 1:
                System.out.println("Toplam : " + (nmbr1 + nmbr2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (nmbr1 - nmbr2));
                break;
            case 3:
                System.out.println("Çarpma : " + (nmbr1 * nmbr2));
                break;
            case 4:
                if (nmbr2 != 0)
                {
                    System.out.print("Bölme : " + (nmbr1 / nmbr2));
                } else
                    System.out.println("Sayı sıfıra bölünemez");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.Tekrar deneyiniz.");
        }
    }
}
