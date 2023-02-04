package adapter;

public class kmHoursCar implements Car {

    /**
     * Поле скорость в км/ч (параметр, который есть у всех автомобилей)
     */
    private final double speed;

    /**
     * конструктор для создания автомобиля
     * @param speed - скорость
     */
    public kmHoursCar(double speed) {
        this.speed = speed;

    }

    /**
     * Метод получения значения поля (скорость)
     * @return - скорость
     */
    @Override
    public double getSpeed() {
        return speed;

    }
}
