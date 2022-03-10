/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının
yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun.
Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
 */
package metotlar_siniflar_diziler_OOP;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayTranspoz {
    public static void main(String[] args) {

        int x, y;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matrisiniz kaca kac olacak");
        x = inp.nextInt();
        y = inp.nextInt();
        int ar[][] = new int[x][y];
        int nar[][] = new int[y][x];
        int ex = 0, ey = 0;//eleman x, eleman y
        int nex = 0, ney = 0;// new eleman x, new eleman y;
        while(ex < x){
            ey = 0;
            while(ey < y ){
                System.out.println(ex + " satirindaki " + ey + " sutun elemanini: " );
                ar[ex][ey] = inp.nextInt();
                ey++;
            }
            ex++;
        }
        ey = 0;
        ex = 0;
        while(nex < y){
            ney = 0;
            ey = 0;
            while(ney < x ){
                nar[nex][ney] = ar[ey][ex];
                ney++;
                ey++;
            }
            ex++;
            nex++;
        }

        System.out.println(Arrays.deepToString(ar));
        System.out.println("Transpoze: ");
        System.out.println(Arrays.deepToString(nar));


    }
}
