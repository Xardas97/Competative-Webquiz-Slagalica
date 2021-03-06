package classes;

import controllers.GameController;

public class GamePoints {

    public final String game;
    public final int blue;
    public final int red;

    public GamePoints(String game, int blue, int red) {
        this.game = game;
        this.blue = blue;
        this.red = red;
    }

    public GamePoints(GameController.GameView game, int blue, int red) {
        this(game.name(), blue, red);
    }

    public GamePoints(String game, int blue) {
        this(game, blue, 0);
    }

    public GamePoints(GameController.GameView game, int blue) {
        this(game.name(), blue, 0);
    }

    public String getGame() {
        return game;
    }

    public int getBlue() {
        return blue;
    }

    public int getRed() {
        return red;
    }

}
