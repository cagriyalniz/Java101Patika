/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.

formül = 1 + 1/2 + 1/3 + .... + 1 / n
 */
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        int nmbr;
        double harmonic = 0.0;
        Scanner inp = new Scanner(System.in);

        System.out.print("harmonigi hesaplanacak sayi: ");
        nmbr = inp.nextInt();
        for (double i = 1; i <= nmbr; i++){
            harmonic += (1 / i);
        }
        System.out.print("harmonik seri:......" + harmonic);
    }
}
