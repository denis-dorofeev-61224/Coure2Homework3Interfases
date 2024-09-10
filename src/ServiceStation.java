public class ServiceStation {

    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем транспортное средство: " + vehicle.getClass().getSimpleName());
        vehicle.updateTyre(); // Метод из Vehicle

        if (vehicle instanceof EngineVehicle) {
            ((EngineVehicle) vehicle).checkEngine(); // Метод из EngineVehicle
        }

        if (vehicle instanceof TrailerVehicle) {
            ((TrailerVehicle) vehicle).checkTrailer(); // Метод из TrailerVehicle
        }
    }
}
