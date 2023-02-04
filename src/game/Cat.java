package game;

public class Cat extends Participant{

    /**
     * Вызов персонажа Cat
     * @param name - имя
     * @param distanceLimit - расстояния дорожки
     * @param jumpLimit - высота прыжка
     */
    public Cat(String name, int distanceLimit, int jumpLimit) {
        super(name, distanceLimit, -1, jumpLimit);

    }
}
