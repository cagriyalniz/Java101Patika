package metotlar_siniflar_diziler_OOP.FinalProject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.DoubleStream;

public class MineSweeper {
    int en;
    int boy;
    int bombTotal;

    MineSweeper(int en, int boy) {
        this.en = en;
        this.boy = boy;
        this.bombTotal = (en * boy) / 4;
    }

    int[][] CreateBoard(MineSweeper masa) {
        int lenB, lenE, len, rBomb;
        len = this.en * this.boy;
        lenB = this.boy;
        lenE = this.en;
        int[][] ar;
        ar = new int[this.boy][this.en];

        while (lenB > 0){

            int e = 0;
            while(e < lenE){
                System.out.print("_");
                e++;
            }
            System.out.println();
            lenB--;
        }


        return ar;
    }

    public static int kendiBomb(MineSweeper masaB, float []bombaninyeri){

        int syc = 0, index = 0, boy, en;
        while(syc < bombaninyeri.length){
            boy = (int)bombaninyeri[syc]/10;
            en = (int)bombaninyeri[syc]%10;
            alan(masaB[boy][en]);

            syc++;
        }

        return 1;//degisecek

    }

    public static void alan(int[][] eleman)
    {

    }

    private static  float [] randomBomb(MineSweeper masa)
    {
        float []xr;
        xr = new float[masa.bombTotal];
        int en = masa.en; //disaridan masa.en diye cagirabilecegiz
        int boy = masa.boy;
        int adet = 0;
        Random r = new Random();
        int flag = 1;
        while(adet < 6){
            int b = r.nextInt(boy + 1 - 0) + 0;
            int e = r.nextInt(en + 1 - 0) + 0;
            //System.out.println("b:" + b);
            //System.out.println("e: " + e);
            //System.out.println(Arrays.toString(xr));
            float be = (float)b + (float)((float)e*0.1);
            flag = 1;
            for(float don : xr){
                if (be == don){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                xr[adet] = be;
            }

            adet++;
        }
        //System.out.println("float array: ");
        //System.out.println(Arrays.toString(xr));
        return xr;
    }

}


/*
[4, 4, 2, 3, 4, 5, 2, 1, 0, 0]
[5, 4, 1, 4, 3, 4, 2, 2, 0, 0]
 */