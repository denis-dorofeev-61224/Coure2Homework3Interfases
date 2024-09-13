public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем транспортное средство: " + transport.getModelName());
        transport.service(); // Вызов метода service, который будет выполнять свои действия в зависимости от типа транспорта
    }
}
