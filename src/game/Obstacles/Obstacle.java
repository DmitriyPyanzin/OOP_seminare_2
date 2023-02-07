package game.Obstacles;

import game.Participant.Participant;

public interface Obstacle {

    boolean overcome(Participant participant);


    String type();

}
