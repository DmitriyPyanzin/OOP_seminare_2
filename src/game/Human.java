package game;

public class Human extends Participant {

    /**
     * Метод вызова человека
     * @param name - имя
     * @param distanceLimit - длина бега
     * @param swimLimit - длина заплыва
     * @param jumpLimit - высота прыжка
     */
    public Human(String name, int distanceLimit, int swimLimit, int jumpLimit) {
        super(name, distanceLimit, swimLimit, jumpLimit);

    }
}
