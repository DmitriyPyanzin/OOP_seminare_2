package game;

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

    public void overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        return jumpLimit >= height;
    }

    /**
     * Метод получения значения поля
     * @return - возврат высоты стены
     */
    public int getHeight() {
        return height;

    }
}
