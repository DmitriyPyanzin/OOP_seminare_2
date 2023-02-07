package game.Participant;

import game.Obstacles.Wall.Jumpable;
import game.Obstacles.Road.Runnable;
import game.Obstacles.Swim.Swimmable;
import game.Obstacles.Rope.Ropeable;

public abstract class Participant implements Runnable, Swimmable, Jumpable, Ropeable {

    /**
     * Имя участника
     */
    private final String name;

    /**
     * Сколько может пробежать
     */
    private final int distanceLimit;

    /**
     * Сколько проплывет
     */
    private final int swimLimit;

    /**
     * Как высоко прыгнет
     */
    private final int jumpLimit;

    /**
     * Как высоко залезет
     */
    private final int ropeLimit;

    /**
     * Конструктор характеристики спортсмена
     * @param name - имя
     * @param distanceLimit - расстояние
     * @param jumpLimit - высота
     * @param swimLimit - бассейн
     */
    public Participant(String name, int distanceLimit, int swimLimit, int jumpLimit, int ropeLimit) {
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.ropeLimit = ropeLimit;

    }

    /**
     * Вызов имени
     * @return - выводит имя участника
     */
    public String getName() {
        return name;

    }

    /**
     * Вызов дистанции дороги
     * @return - Сколько пробежит
     */
    @Override
    public int getDistanceLimit() {
        return distanceLimit;

    }

    /**
     * Вызов длины бассейна
     * @return - сколько проплывет
     */
    @Override
    public int getSwimLimit() {
        return swimLimit;

    }

    /**
     * Высота прыжка
     * @return - как высоко подпрыгнет
     */
    @Override
    public int getJumpLimit() {
        return jumpLimit;

    }

    /**
     * Высота каната
     * @return - как высоко залезет
     */
    @Override
    public int getRopeLimit() {
        return ropeLimit;

    }
}
