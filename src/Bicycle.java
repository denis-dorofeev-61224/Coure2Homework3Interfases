public class Bicycle extends Transport implements Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде " + modelName);
    }

    // Реализация метода service для велосипеда
    @Override
    public void service() {
        updateTyre();
    }
}
