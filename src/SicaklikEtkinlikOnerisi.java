/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Aynı örnek üzerinden if koşulları başka hangi şekilde
oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
import java.util.Scanner;
public class SicaklikEtkinlikOnerisi {
    public static void main(String[] args)
    {
        double scklk;
        Scanner inp = new Scanner(System.in);

        System.out.println("Havanin sicakligi kaç celcius derece ? ");
        scklk = inp.nextDouble();

        if (scklk < 5)
            System.out.println("kayak yapabilirsiniz");
        else if (scklk >= 5 && scklk <= 15)
            System.out.println("sinemaya gidebilirsiniz");
        else if (scklk >15 && scklk <= 25)
            System.out.println("piknik yapabilirsiniz");
        else
            System.out.println("yüzmeye gidebilirsiniz");



    }
}
