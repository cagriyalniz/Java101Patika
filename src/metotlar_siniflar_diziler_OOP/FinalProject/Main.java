package metotlar_siniflar_diziler_OOP.FinalProject;

public class Main {
    public static void main(String[] args) {

        MineSweeper game = new MineSweeper(6, 6);
        game.CreateBoard(game);
        //game.AddBomb(game);

    }
}
