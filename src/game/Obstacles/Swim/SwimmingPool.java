package game.Obstacles.Swim;

import game.Obstacles.AbstractObstacle;

public class SwimmingPool extends AbstractObstacle {

    /**
     * Конструктор
     * @param distancePool - дистанция бассейна
     */
    public SwimmingPool(int distancePool) {
        super(distancePool);

    }

    public boolean overcome(Swimmable swimmable) {
        int swimLimit = swimmable.getSwimLimit();
        return swimLimit >= getParametr();
    }
}
