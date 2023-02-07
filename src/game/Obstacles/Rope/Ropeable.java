package game.Obstacles.Rope;

import game.Participant.HasName;

public interface Ropeable extends HasName {

    /**
     * Высота каната
     * @return - возврат максимальной высоты каната
     */
    int getRopeLimit();

}
