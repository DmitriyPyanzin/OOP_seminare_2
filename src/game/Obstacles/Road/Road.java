package game.Obstacles.Road;

public class Road {

    /**
     * дистанция дорожки
     */
    private final int distance;

    /**
     * Конструктор
     * @param distance - дистанция
     */
    public Road(int distance) {
        this.distance = distance;

    }

    public boolean overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return distanceLimit >= distance;
    }
}