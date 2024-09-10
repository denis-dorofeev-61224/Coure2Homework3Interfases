public class Car implements EngineVehicle{

    private String modelName;
    private int wheelsCount;
    private String engine;

    public Car(String modelName, int wheelsCount, String engine) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.engine = engine;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }

    @Override
    public void checkEngine() {
        System.out.println("Двигатель проверен");
    }
    //геттеры и сеттеры
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

}
