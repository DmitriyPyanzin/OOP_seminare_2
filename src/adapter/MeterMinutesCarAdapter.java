package adapter;

public class MeterMinutesCarAdapter implements Car {

    /**
     * Вызов значения м/мин
     */
    private final MetersMinutesCar metersMinutesCar;

    /**
     * Конструктор
     * @param metersMinutesCar - скорость в м/мин
     */
    public MeterMinutesCarAdapter(MetersMinutesCar metersMinutesCar) {
        this.metersMinutesCar = metersMinutesCar;
    }

    /**
     * Возврат скорости
     * @return - возврат скорости в км/ч
     */
    @Override
    public double getSpeed() {
        return metersMinutesCar.getSpeed() / 1000.0 * 60.0;

    }
}
