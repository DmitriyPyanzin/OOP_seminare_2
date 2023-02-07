package game.Obstacles.Rope;

public class RopeClimbing {

    /**
     * Высота каната
     */
    private final int height;

    /**
     * Конструктор
     * @param distance - высота каната
     */
    public RopeClimbing(int distance) {
        this.height = distance;

    }

    public boolean overcome(Ropeable ropeable) {
        int ropeLimit = ropeable.getRopeLimit();
        return ropeLimit >= height;
    }
}
