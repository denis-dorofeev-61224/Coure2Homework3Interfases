public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java and world!");
        System.out.println("*********************");

        // Создание объектов с правильными параметрами
        Car car = new Car("car1", 4, "V6");
        Car car2 = new Car("car2", 4, "V8");

        Truck truck = new Truck("truck1", 6, "V12", "BigTrailer");
        Truck truck2 = new Truck("truck2", 8, "V12", "MegaTrailer");

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        // Создание сервисной станции
        ServiceStation station = new ServiceStation();

        // Проверка транспортных средств И велосипеда
        station.check(car);     // Проверяем car1
        station.check(car2);    // Проверяем car2
        station.check(bicycle); // Проверяем bicycle1
        station.check(bicycle2);// Проверяем bicycle2
        station.check(truck);   // Проверяем truck1
        station.check(truck2);  // Проверяем truck2
    }
}