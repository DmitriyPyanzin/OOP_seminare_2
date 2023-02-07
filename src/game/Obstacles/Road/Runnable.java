package game.Obstacles.Road;

import game.Participant.HasName;

public interface Runnable extends HasName {

    /**
     * Возврат максимальной дистанции
     * @return - максимальная дистанция
     */
    int getDistanceLimit();

}
