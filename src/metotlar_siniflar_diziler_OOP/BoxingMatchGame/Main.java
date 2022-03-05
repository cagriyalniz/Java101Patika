/*
boksorlerin ozellikleri tanımlandi
dodge ozelligi random olarak alindi
dovuse kimin baslayayacagini belirten yazi-tura islemi random olarak belirlendi
 */
package metotlar_siniflar_diziler_OOP.BoxingMatchGame;

public class Main {
    public static void main(String[] args) {

        int maxYT = 1, minYT = 0;
        int maxDodge = 0, minDodge = 60;
        //int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int fyaziTura = (int)Math.floor(Math.random()*(maxYT-0+minYT)+minYT);
        int fturaYazi;
        if(fyaziTura == 0)
            fturaYazi = 1;
        else
            fturaYazi = 0;

        int dodgef1 = (int)Math.floor(Math.random()*(maxDodge-0+minDodge)+minDodge);
        int dodgef2 = (int)Math.floor(Math.random()*(maxDodge-0+minDodge)+minDodge);
        Fighther fighter1 = new Fighther("Cagri", 10, 100, 78, dodgef1, fyaziTura);
        Fighther fighther2 = new Fighther("MikeTyson", 8, 97, 75, dodgef2, fturaYazi);
        Fighther fighther3 = new Fighther("Rocky", 7, 98, 77, 25, fturaYazi);

        Match match = new Match(fighter1, fighther2, 73, 80);
        match.Run();
    }
}
