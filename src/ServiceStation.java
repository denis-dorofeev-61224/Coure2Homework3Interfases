public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем транспортное средство: " + vehicle.getClass().getSimpleName());
        vehicle.updateTyre();
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }
}
/*
ПРИМЕР КОДА С ПЕРЕГРУЗКОЙ МЕТОДОВ
public class ServiceStation {

    // Перегруженный метод для машин
    public void serviceVehicle(Car car) {
        System.out.println("Обслуживаем машину: " + car.getModelName());
        car.updateTyre();
        car.checkEngine();
        car.checkTrailer();
    }

    // Перегруженный метод для грузовиков
    public void serviceVehicle(Truck truck) {
        System.out.println("Обслуживаем грузовик: " + truck.getModelName());
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }

    // Перегруженный метод для велосипедов
    public void serviceVehicle(Bicycle bicycle) {
        System.out.println("Обслуживаем велосипед: " + bicycle.getModelName());
        bicycle.updateTyre();
        bicycle.checkEngine();
        bicycle.checkTrailer();
    }
}
 */