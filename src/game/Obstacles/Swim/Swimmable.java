package game.Obstacles.Swim;

import game.Participant.HasName;

public interface Swimmable extends HasName {

    /**
     * Длина заплыва
     * @return - возврат максимального заплыва
     */
    int getSwimLimit();

}
