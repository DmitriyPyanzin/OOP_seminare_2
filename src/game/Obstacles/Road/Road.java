package game.Obstacles.Road;

import game.Obstacles.AbstractObstacle;

public class Road extends AbstractObstacle {

    /**
     * Конструктор
     * @param distanceRoad - дистанция
     */
    public Road(int distanceRoad) {
        super(distanceRoad);

    }

    public boolean overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return distanceLimit >= getParametr();
    }
}
