public class Car extends Transport implements EngineVehicle {

    private String engine;
    int wheelsCounts;

    public Car(String modelName, int wheelsCount, String engine) {
        super(modelName, wheelsCount);
        this.engine = engine;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине " + modelName);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины " + modelName);
    }

    // Реализация метода service для машины
    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
