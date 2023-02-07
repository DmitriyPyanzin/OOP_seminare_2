package game.Obstacles.Road;

import game.Obstacles.Obstacle;
import game.Participant.Participant;

public class RoadObstacleAdapter implements Obstacle {

    private final Road road;


    public RoadObstacleAdapter(Road road) {
        this.road = road;

    }

    @Override
    public boolean overcome(Participant participant) {
        return road.overcome(participant);

    }

    @Override
    public String type() {
        return "Дорожка";

    }
}
