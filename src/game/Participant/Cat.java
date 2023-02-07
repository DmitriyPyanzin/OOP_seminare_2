package game.Participant;

public class Cat extends Participant {

    /**
     * Вызов персонажа Cat
     * @param name - имя
     * @param distanceLimit - расстояния дорожки
     * @param jumpLimit - высота прыжка
     * @param ropeLimit - высота каната
     */
    public Cat(String name, int distanceLimit, int jumpLimit, int ropeLimit) {
        super(name, distanceLimit, -1, jumpLimit, ropeLimit);

    }
}
