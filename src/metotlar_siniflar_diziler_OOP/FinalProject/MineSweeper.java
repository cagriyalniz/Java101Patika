package metotlar_siniflar_diziler_OOP.FinalProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class MineSweeper {
    int en;
    int boy;
    int bomb;

    MineSweeper(int en, int boy) {
        this.en = en;
        this.boy = boy;
        this.bomb = (en * boy) / 4;
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

    int[][] AddBomb(MineSweeper masa) {
        System.out.println("Hello world!");
        int x = 123;
        int y = 123;
        int boy = 6, en = 4;
        int mynSayisi = boy*en/ 4;
        int Mboy[] = new int[mynSayisi + 1];
        int Men[] = new int [mynSayisi + 1];
        int Menboy[] = new int [mynSayisi];
        int MmM[][] = new int[boy][en];
        Random r = new Random ();
        int flag = 1;
        while (mynSayisi > 0){

            flag = 1;
            while(flag == 1){
                x = r.nextInt(boy + 1);
                System.out.println("random x: " + x);
                y = r.nextInt(en + 1);
                System.out.println("random y: " + y);
                for(int i : Mboy){
                    System.out.println("i nin baktigi Mboy:" + i);

                    for(int j : Men){
                        System.out.println("j nin baktigi Men:" + j);
                        if(i == x && j == y){
                            flag = 0;
                            break;
                        }
                        j++;
                    }
                    if(flag == 0){
                        break;
                    }
                    i++;
                }
                if(flag == 1){
                    Mboy[x] = x;
                    Men[y] = y;
                    System.out.println("atana Mboy: " + Mboy[x] + " atanan Men: " + Men[y]);
                }
            }
            System.out.println("Mboy[x]" + Mboy[x]);
            System.out.println("Mboy[y]" + Mboy[y]);
            mynSayisi--;
        }

        //Arrays.stream(Mboy).forEach(System.out::print);

        System.out.println();
        System.out.print(Arrays.toString(Mboy));
        System.out.println();
        System.out.print(Arrays.toString(Men));
        //Arrays.stream(Men).forEach(System.out::print);
        //System.out.println("x: " + Array + "y: " + y);

        return masa.CreateBoard(masa);
    }

}
