public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java and world!");
        System.out.println("*********************");

        // Создание объекта сервисной станции
        ServiceStation station = new ServiceStation();

        // Создание двух велосипедов
        Bicycle bicycle1 = new Bicycle("BicycleModel1", 2);
        Bicycle bicycle2 = new Bicycle("BicycleModel2", 2);

        // Создание двух машин
        Car car1 = new Car("CarModel1", 4, "V6");
        Car car2 = new Car("CarModel2", 4, "V8");

        // Создание двух грузовиков
        Truck truck1 = new Truck("TruckModel1", 6, "V12", "LargeTrailer");
        Truck truck2 = new Truck("TruckModel2", 8, "V12", "MegaTrailer");

        // Проверка всех транспортных средств на сервисной станции
        System.out.println("Обслуживание велосипедов:");
        station.check(bicycle1);
        station.check(bicycle2);

        System.out.println("\nОбслуживание машин:");
        station.check(car1);
        station.check(car2);

        System.out.println("\nОбслуживание грузовиков:");
        station.check(truck1);
        station.check(truck2);
    }
}