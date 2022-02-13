import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
public class Manav {
    public static void main(String[] args)
    {
        double armt_kg = 2.14, elma_kg = 3.67, dmts_kg = 1.11, muz_kg = 0.95, ptlcn_kg = 5.00;
        Scanner inp = new Scanner(System.in);

        System.out.println("kac kilo armut istersiniz: ");
        double armt =inp.nextDouble();
        armt *= armt_kg;

        System.out.println("kac kilo elma istersiniz: ");
        double elma = inp.nextDouble();
        elma *= elma_kg;

        System.out.println("kac kilo domates istersiniz: ");
        double dmts = inp.nextDouble();
        dmts *= dmts_kg;

        System.out.println("kac kilo muz istersiniz: ");
        double muz = inp.nextDouble();
        muz *= muz_kg;

        System.out.println("kac kilo patlıcan istersiniz: ");
        double ptlcn = inp.nextDouble();
        ptlcn *= ptlcn_kg;

        double total = ptlcn + muz + dmts + elma + armt;
        System.out.println("Borcunuz: " + total);
    }
}
