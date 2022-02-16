/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise
ortalamaya katılmasın.
 */

import java.util.Scanner;
public class SinifGecme {
    public static void main(String [] args)
    {
        double mat, fzk, trkc, kmy, mzk, puan = 0;

        Scanner inp = new Scanner(System.in);

        int syc = 0;


        System.out.print("Matemetik Notunuzu Giriniz : ");
        mat = inp.nextDouble();
        if(mat<=100 && mat>=0){
            puan += mat;
            syc++;
        }
        System.out.print("Fizik Notunuzu Giriniz : ");
        fzk = inp.nextDouble();
        if(fzk<=100 && fzk>=0){
            puan += fzk;
            syc++;
        }
        System.out.print("Türkçe Notunuzu Giriniz : ");
        trkc = inp.nextDouble();
        if (trkc<=100 && trkc>=0){
            puan += trkc;
            syc++;
        }
        System.out.print("Kimya Notunuzu Giriniz : ");
        kmy = inp.nextDouble();
        if (kmy<=100 && kmy>=0){
            puan += kmy;
            syc++;
        }
        System.out.print("Müzik Notunuzu Giriniz : ");
        mzk = inp.nextDouble();
        if (mzk<=100 && mzk>=0){
            puan += mzk;
            syc++;
        }

        puan = puan/syc;

        System.out.println("Ortalamanız : " +puan);
        if(puan<55){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
    }
}
