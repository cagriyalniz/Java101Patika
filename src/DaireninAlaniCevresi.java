/*
Java ile yarı çapını kullanıcıdan aldığınız
dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 */

import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args)
    {
        float pi = 3.14F;
        System.out.println("alani ve cevresi hesaplanacak dairenin yaricapini giriniz: ");

        Scanner inp = new Scanner(System.in);
        float yaricap = inp.nextFloat();
        float alan = pi*yaricap*yaricap;
        float cevre = 2*pi*yaricap;
        System.out.println("alan: " + alan + "   cevre: " + cevre);


        System.out.println("alani hesaplanacak daire diliminin yaricapini ve merkez acisini giriniz: ");
        yaricap = inp.nextFloat();
        float merkez_aci = inp.nextFloat();
        alan = pi*(yaricap*yaricap)*merkez_aci/360;
        System.out.println("alan: " + alan);
    }
}
