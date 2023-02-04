package adapter;

public class CarService {

    /**
     * Метод расчета расстояния
     * @param car - Скорость автомобиля
     * @param timeHours - время езды автомобиля в часах
     * @return - расстояние, которое проехал автомобиль
     */
    double calculateDistance(Car car, int timeHours) {
        return car.getSpeed() * timeHours;

    }
}
