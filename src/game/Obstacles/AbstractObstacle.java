package game.Obstacles;

public abstract class AbstractObstacle {

    /**
     * Передаваемый интовый параметр
     */
    private final int parametr;


    /**
     * Конструктор
     * @param parametr - передаваемый параметр
     */
    public AbstractObstacle(int parametr) {
        this.parametr = parametr;

    }

    /**
     * Геттер
     * @return - возврат значения
     */
    public int getParametr() {
        return parametr;
    }
}
