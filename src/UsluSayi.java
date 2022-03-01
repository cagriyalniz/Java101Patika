/*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
"For Döngüsü" kullanarak yapınız.

 */
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double nmbr, sq, res = 1;

        System.out.println("hangi sayinin kacinci ustu alinsin");
        System.out.println("hangi sayi");
        nmbr = inp.nextInt();
        System.out.println("kacinci ustu: ");
        sq = inp.nextInt();

        if (sq > 0) {
            while (sq-- > 0) {
                res *= nmbr;
            }
        }
        else if(sq < 0){
            while(sq++ < 0) {
                res /= nmbr;
            }
        }
        else
            res = 1;
        System.out.println("sonuc: " + res);

        System.out.println("------ODEV------");
        int i;
        System.out.println("hangi sayinin kacinci ustu alinsin");
        System.out.println("hangi sayi");
        nmbr = inp.nextInt();
        System.out.println("kacinci ustu: ");
        sq = inp.nextInt();
        res = 1;
        for(i = 0; i < sq; i++){
            res *= nmbr;
        }
        System.out.println("sonuc: " + res);
    }


}
