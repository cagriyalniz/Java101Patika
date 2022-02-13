/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */
import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args)
    {
        double boy, kilo, vki;

        System.out.println("lütfen boyunuzu ve kilonuzu giriniz: ");
        Scanner inp = new Scanner(System.in);

        boy = inp.nextFloat();
        kilo = inp.nextFloat();
        vki =  (kilo / (boy*boy));
        System.out.println("vücut kütle indexiniz: " + vki);

    }
}
