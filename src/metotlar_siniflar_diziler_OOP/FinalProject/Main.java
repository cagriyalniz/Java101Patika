package metotlar_siniflar_diziler_OOP.FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int satir;
        int sutun;
        int totalSwipe;
        int i;
        int j;

        System.out.println("kaca kaclik oyun olsun? (min 2X2)");
        satir = inp.nextInt();
        sutun = inp.nextInt();
        totalSwipe = satir*sutun/4;
        i = satir;
        j = sutun;

        while(i >= 0){

            j = 0;
            while(j >= 0){

            }
        }

        Player soldier = new Player();
        int flag = 1;
        while (flag == 1){
            System.out.println("gir sayi gir");
            System.out.println("kacinci satir? ");
            soldier.chooseY = inp.nextInt();
            System.out.println("kacinci sutun? ");
            soldier.chooseX = inp.nextInt();



        }


    }
}
