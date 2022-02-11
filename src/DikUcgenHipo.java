/*
Java ile kullanıcıdan dik kenarlarının uzunluğunu
alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
 alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

 */
import java.util.Scanner;

public class DikUcgenHipo {
    public static void main(String[] args)
    {
        int kenarA, kenarB;
        double hipot;

        System.out.println("dik kenarlarin uzunlugunu giriniz: ");
        Scanner inp = new Scanner(System.in);
        kenarA = inp.nextInt();
        kenarB = inp.nextInt();

        hipot = Math.sqrt((kenarA*kenarA) + (kenarB*kenarB));
        System.out.println("hipotenus degeri: " + hipot);

        int kenarC, kenarD, kenarE, cevre;
        double alan, u;

        System.out.println("yeni ucgenin uc kenarini giriniz");
        kenarC = inp.nextInt();
        kenarD = inp.nextInt();
        kenarE = inp.nextInt();

        cevre = kenarE + kenarD + kenarC;
        u = cevre/2;
        alan = Math.sqrt(u*(u - kenarC) * (u - kenarD) * (u - kenarE));

        System.out.println("ucgennin cevresi: " + cevre + " alani: " + alan);


    }
}
