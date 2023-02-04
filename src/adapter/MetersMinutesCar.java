package adapter;

public class MetersMinutesCar{

    /**
     * Поле скорость (параметр, который есть у всех автомобилей)
     */
    private final double speed;

    /**
     * конструктор для создания автомобиля
     * @param speed - скорость
     */
    public MetersMinutesCar(double speed) {
        this.speed = speed;

    }

    /**
     * Метод получения значения поля (скорость)
     * @return - скорость
     */
    public double getSpeed() {
        return speed;

    }
}
