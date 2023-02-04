package game;

public abstract class Participant implements Runnable, Swimmable, Jumpable {

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
     * Конструктор характеристики спортсмена
     * @param name - имя
     * @param distanceLimit - расстояние
     * @param jumpLimit - высота
     * @param swimLimit - бассейн
     */
    public Participant(String name, int distanceLimit, int swimLimit, int jumpLimit) {
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;


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
}
