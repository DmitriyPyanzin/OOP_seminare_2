package game.Obstacles.Rope;

import game.Obstacles.Obstacle;
import game.Participant.Participant;

public class RopeObstacleAdapter implements Obstacle {

    private final RopeClimbing ropeClimbing;

    public RopeObstacleAdapter(RopeClimbing ropeClimbing) {
        this.ropeClimbing = ropeClimbing;

    }

    @Override
    public boolean overcome(Participant participant) {
        return ropeClimbing.overcome(participant);

    }

    @Override
    public String type() {
        return "Канат";

    }
}
