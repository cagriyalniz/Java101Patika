/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
hesaplayıp ekrana bastırılan programı yazın.

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args)
    {
        int mat, fzk, kmy, trkc, trh, mzk;
        int ort;

        Scanner inp = new Scanner(System.in);
        System.out.println("matematik, fizik, kimya, türkçe, tarih, müzik ders notlarını giriniz");
        mat = inp.nextInt();
        fzk = inp.nextInt();
        kmy = inp.nextInt();
        trkc = inp.nextInt();
        trh = inp.nextInt();
        mzk = inp.nextInt();

        ort = (mat + fzk + kmy + trkc + trh + mzk) / 6;
        System.out.println("not ortalamaniz " + ort);

        boolean gecmeDurumu;
        int gecmeNotu;

        gecmeNotu = 60;
        gecmeDurumu = ort >= gecmeNotu;

        String str  = gecmeDurumu ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(str);
    }
}
