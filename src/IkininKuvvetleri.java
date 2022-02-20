/*
Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args){
        int s1,  count = 2, b_count1 = 4, b_count2 = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayinizi giriniz: ");
        s1 = inp.nextInt();
        while(count <=s1){
            System.out.println(count);
            count = count*2;

        }


        System.out.println("*-*-*-*-*-*ODEV*-*-*-*-*-*");
        while(b_count1 <=s1){
            System.out.println(b_count1);
            b_count1 = b_count1*4;

        }
        while(b_count2 <=s1){
            System.out.println(b_count2);
            b_count2 = b_count2*5;

        }
    }
}
