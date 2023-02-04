package game;

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

    public void overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return distanceLimit >= distance;
    }

    /**
     * Метод получения значения поля
     * @return - возврат дистанции
     */
    public int getDistance() {
        return distance;

    }
}
