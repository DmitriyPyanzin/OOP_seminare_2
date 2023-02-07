package game.Obstacles.Wall;

import game.Obstacles.AbstractObstacle;

public class Wall extends AbstractObstacle {

    /**
     * Конструктор
     * @param height - высота стены
     */
    public Wall(int height) {
        super(height);

    }

    public boolean overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        return jumpLimit >= getParametr();
    }
}
