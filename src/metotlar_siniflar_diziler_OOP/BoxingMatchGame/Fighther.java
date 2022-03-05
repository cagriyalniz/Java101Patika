package metotlar_siniflar_diziler_OOP.BoxingMatchGame;

public class Fighther {
    String name;
    int damage; //vurma hasari
    int health;
    int weight; //siklet
    int dodge;
    int yaziTura;

    //constructer(kurucu metot)
    Fighther(String name, int damage, int health, int weight, int dodge, int yaziTura){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }
        else
            this.dodge = 0;
        this.yaziTura = yaziTura;
    }

    int hit(Fighther foo){//parametre olarak gelen deger rakip
        System.out.println(this.name + " --> " + foo.name + " " + this.damage + "gucuyle vurdu!");
        if (foo.isDodge()){
            System.out.println("ama " + foo.name + "blokladi");
            return foo.health;
        }
        if (foo.health - this.damage < 0){
            return 0;
        }
        return foo.health - this.damage;
    }

    boolean isDodge(){
        double rndmNumber = Math.random() * 100;
        return rndmNumber <= this.dodge;
    }

}
