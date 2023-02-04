package game;

public class SwimmingPool {

    /**
     * длина бассейна
     */
    private final int distance;

    /**
     * Конструктор
     * @param distance - дистанция бассейна
     */
    public SwimmingPool(int distance) {
        this.distance = distance;

    }

    public boolean overcome(Swimmable swimmable) {
        int swimLimit = swimmable.getSwimLimit();
        return swimLimit >= distance;
    }

    /**
     * Метод получения значения поля
     * @return - возврат дистанции бассейна
     */
    public int getDistance() {
        return distance;

    }
}
