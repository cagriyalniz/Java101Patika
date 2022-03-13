package metotlar_siniflar_diziler_OOP.FinalProject;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {

        int[][] ar = {{1, 2}, {2, 3}};
        System.out.println(Arrays.deepToString(ar));
        //bombaEkle(ar);
        System.out.println(Arrays.toString(randomBomb(ar)));
        //System.out.println(randomBomb(ar).length);
    }

    public static int kendiBomb(int[][] masa, float []bombaninyeri){

        int syc = 0, index = 0, boy, en;
        while(syc < bombaninyeri.length){
            boy = (int)bombaninyeri[0]/10;
            en = (int)bombaninyeri[0]%10;
            //masa[boy][en]

            syc++;
        }

        return 1;//degisecek

    }

    private static  float [] randomBomb(int [][] masa)
    {
        float []xr;
        xr = new float[6];
        int en = 6; //disaridan masa.en diye cagirabilecegiz
        int boy = 4;
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