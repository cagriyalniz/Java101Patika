import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        int rand, tSayi, flag = 0;
        Scanner inp = new Scanner(System.in);
        Random randR = new Random();

        rand = randR.nextInt(100);
        while (flag == 0) {
            System.out.println("sayiyi tahmin etmeye calisin: ");
            tSayi = inp.nextInt();
            if (tSayi > rand){
                System.out.println("cok buyuk yazdiniz kucultun");
            }
            else if(tSayi < rand){
                System.out.println("cok kucuk yazdiniz buyutun");
            }
            else{
                System.out.println("dogru!!!!");
                flag = 1;
            }

        }

    }
}
