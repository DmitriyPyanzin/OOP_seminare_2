package game.Obstacles.Wall;

public class Wall {

    /**
     * Высота стены
     */
    private final int height;

    /**
     * Конструктор
     * @param distance - высота стены
     */
    public Wall(int distance) {
        this.height = distance;

    }

    public boolean overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        return jumpLimit >= height;
    }
}
