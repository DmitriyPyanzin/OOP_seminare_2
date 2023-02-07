package game.Participant;

public class Snake extends Participant {

    /**
     * Параметры змеи
     * @param name - имя
     * @param distanceLimit - длина бега
     * @param swimLimit - длина заплыва
     * @param ropeLimit - высота каната
     */
    public Snake(String name, int distanceLimit, int swimLimit, int ropeLimit) {

        super(name, distanceLimit, swimLimit, -1, ropeLimit);

    }
}
