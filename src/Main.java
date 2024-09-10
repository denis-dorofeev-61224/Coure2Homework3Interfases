import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java and world!");
        System.out.println("*********************");
        //создание объектов
        // Создаем объект сервисной станции
        ServiceStation station = new ServiceStation();

        // Создаем два велосипеда с рандомными параметрами
        Bicycle bicycle1 = new Bicycle("BicycleModel1", getRandomWheels(2));
        Bicycle bicycle2 = new Bicycle("BicycleModel2", getRandomWheels(2));

        // Создаем две машины с рандомными параметрами
        Car car1 = new Car("CarModel1", getRandomWheels(4), getRandomEngine());
        Car car2 = new Car("CarModel2", getRandomWheels(4), getRandomEngine());

        // Создаем два грузовика с рандомными параметрами
        Truck truck1 = new Truck("TruckModel1", getRandomWheels(6), getRandomEngine(), getRandomTrailer());
        Truck truck2 = new Truck("TruckModel2", getRandomWheels(8), getRandomEngine(), getRandomTrailer());

        // Проверяем все транспортные средства на сервисной станции
        System.out.println("Обслуживание велосипедов:");
        station.check(bicycle1); // Проверка велосипеда 1
        station.check(bicycle2); // Проверка велосипеда 2

        System.out.println("\nОбслуживание машин:");
        station.check(car1); // Проверка машины 1
        station.check(car2); // Проверка машины 2

        System.out.println("\nОбслуживание грузовиков:");
        station.check(truck1); // Проверка грузовика 1
        station.check(truck2); // Проверка грузовика 2
    }

    // Метод для получения случайного количества колес
    public static int getRandomWheels(int defaultWheels) {
        Random random = new Random();
        return defaultWheels; // Возвращаем стандартное количество колес для типа транспорта
    }

    // Метод для получения случайного названия двигателя
    public static String getRandomEngine() {
        String[] engines = {"V6", "V8", "V12"};
        Random random = new Random();
        return engines[random.nextInt(engines.length)]; // Возвращаем случайный двигатель
    }

    // Метод для получения случайного названия прицепа
    public static String getRandomTrailer() {
        String[] trailers = {"SmallTrailer", "MediumTrailer", "LargeTrailer"};
        Random random = new Random();
        return trailers[random.nextInt(trailers.length)]; // Возвращаем случайный прицеп
    }
}