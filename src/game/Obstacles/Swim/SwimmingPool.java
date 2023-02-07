package game.Obstacles.Swim;

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
}
