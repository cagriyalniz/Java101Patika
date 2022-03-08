
import java.util.Scanner;

public class PalindromStr {
    public static void main(String[] args) {

        String str, strRev;
        int i = 0, j = 0, flag = 1, strLen, revIndx;
        Scanner inp = new Scanner(System.in);

        System.out.println("palindrom kontrolu icin kelimeyi giriniz");
        str = inp.next();
        strLen = str.length();
        revIndx = strLen - 1;
 /*       while(i < strLen){
            i++;
        }*/
        while(j < strLen){
            if(str.charAt(revIndx) == str.charAt(j)){
                revIndx--;
                j++;
            }
            else{
                flag = 0;
                System.out.println("palindrom değil!!!");
            }
        }

        if (flag == 1)
            System.out.println("bu kelime bir palindrom!!!");
    }
}
