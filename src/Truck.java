public class Truck implements EngineVehicle,TrailerVehicle {

    private String modelName;
    private int wheelsCount;
    private String engine;
    private String trailer;

    //КОНСТРУКТОР КЛАССА
    public Truck(String modelName, int wheelsCount, String engine, String trailer) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.engine = engine;
        this.trailer = trailer;
    }

    // Реализация метода из интерфейса Vehicle (через EngineVehicle)
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + modelName);
    }

    // Реализация метода из интерфейса EngineVehicle
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике " + modelName);
    }

    // Реализация метода из интерфейса TrailerVehicle
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике " + modelName);
    }

    // Геттеры и сеттеры для всех полей
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

}

