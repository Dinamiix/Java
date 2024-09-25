package needForSpeed;

public class Car extends needForSpeed.Vehicle {

    public Car(double fuel, int horsePower) {
        // Тук реферирам към конструктора на бащиният клас
        super(fuel, horsePower);
        // Тук реферирам към метода setFuelConsumption в бащиният клас
        super.setFuelConsumption(3);
    }
}