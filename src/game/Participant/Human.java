package game.Participant;

public class Human extends Participant {

    /**
     * Метод вызова человека
     * @param name - имя
     * @param distanceLimit - длина бега
     * @param swimLimit - длина заплыва
     * @param jumpLimit - высота прыжка
     */
    public Human(String name, int distanceLimit, int swimLimit, int jumpLimit, int ropeLimit) {
        super(name, distanceLimit, swimLimit, jumpLimit, ropeLimit);

    }
}
