package game.Obstacles.Wall;

import game.Participant.HasName;

public interface Jumpable extends HasName {

    /**
     * интерфейс прыжка
     * @return - максимальный прыжок
     */
    int getJumpLimit();

}
