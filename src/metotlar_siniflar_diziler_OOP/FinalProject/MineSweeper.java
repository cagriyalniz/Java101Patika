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
        int rBomb = masa.bomb;
        masa.CreateBoard(masa);


        Random randR = new Random();
        while (rBomb > 0) {


            int yerlesBomb = randR.nextInt(masa.bomb);
        }

        return masa.CreateBoard(masa);
    }

}
