package game.Obstacles.Rope;

import game.Obstacles.AbstractObstacle;

public class RopeClimbing extends AbstractObstacle {

    /**
     * Конструктор
     * @param lengthRope - высота каната
     */
    public RopeClimbing(int lengthRope) {
        super(lengthRope);

    }

    public boolean overcome(Ropeable ropeable) {
        int ropeLimit = ropeable.getRopeLimit();
        return ropeLimit >= getParametr();
    }
}
