package metotlar_siniflar_diziler_OOP.BoxingMatchGame;

public class Match {
    Fighther f1;
    Fighther f2;
    int minWeight;
    int maxWeight;

    //constructer
    Match(Fighther f1, Fighther f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void Run(){
        if (isCheck()){

            if(f1.yaziTura == 1){
                System.out.println(f1.name + "karsilasmaya basliyor");
                System.out.println("gelen dodgeler: ");
                System.out.println(f1.name + " in dodge'si " + f1.dodge);
                System.out.println(f2.name + " in dodge'si " + f2.dodge);
                while(this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("--yeni atak--");

                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f2.name + "nin cani " + this.f2.health + "kadar kaldi");
                    System.out.println(this.f1.name + "nin cani " + this.f1.health + "kadar kaldi");
                    System.out.println("-- atak bitti --");

                }

            }
            else {
                System.out.println(f2.name + "dovuse basliyor!!!");
                System.out.println("gelen dodgeler: ");
                System.out.println(f1.name + " in dodge'si " + f1.dodge);
                System.out.println(f2.name + " in dodge'si " + f2.dodge);
                while(this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("--yeni atak--");

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f2.name + "nin cani " + this.f2.health + "kadar kaldi");
                    System.out.println(this.f1.name + "nin cani " + this.f1.health + "kadar kaldi");
                    System.out.println("-- atak bitti --");

                }
            }

        }
        else
            System.out.println("sporcuların sikletleri min-max aralığında değil");

    }

    boolean isCheck(){
        return ((this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight));
    }

    boolean isWin(){
        if (this.f1.health <= 0){
            System.out.println(this.f2.name + "kazandı!!");
            return true;
        }

        if(this.f2.health <= 0){
            System.out.println(this.f1.name + "kazandı !!!");
            return true;
        }

        return false;
    }


}
