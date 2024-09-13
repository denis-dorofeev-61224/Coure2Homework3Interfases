public class Truck extends Transport implements EngineVehicle, TrailerVehicle {

    private String engine;
    private String trailer;

    public Truck(String modelName, int wheelsCount, String engine, String trailer) {
        super(modelName, wheelsCount);
        this.engine = engine;
        this.trailer = trailer;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + modelName);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике " + modelName);
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике " + modelName);
    }

    // Реализация метода service для грузовика
    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
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