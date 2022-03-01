/*Java ile faktöriyel hesaplayan program yazıyoruz.

Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int f, res = 1;

        System.out.println("faktoriyalinin hesaplanmasini istediginiz sayiyi giriniz: ");
        f = inp.nextInt();
        while (f > 0){

            res *= f;
            f--;
        }
        System.out.println("girdiginiz sayinin faktoryeli: " + res);

        System.out.println("-------ODEV------");
        //C(n,r) = n! / (r! * (n-r)!)
        int n, r;
        System.out.println("hangi sayinin kacli kombinasyonu hesaplansin: ");
        System.out.println("hangi sayinin: ");
        n = inp.nextInt();
        System.out.println("kacli kombinasyonu: ");
        r = inp.nextInt();

        // n!
        int resN = 1, resR = 1, nN, rR ;
        nN = n;
        rR = r;
        while (nN > 0){

            resN *= nN;
            nN--;
        }
        while (rR > 0){

            resR *= rR;
            rR--;
        }
        // (n-r)!
        int fark = n - r, resF = 1;
        while (fark > 0){

            resF *= fark;
            fark--;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        int sonuc;
        sonuc = resN/(resR*resF);
        System.out.println("kombinasyonunu sonucu: " + sonuc);
    }
}
