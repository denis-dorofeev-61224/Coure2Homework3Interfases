public class Bicycle implements Vehicle{ private String modelName;
    private int wheelsCount;

    //constructor of Class
    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    // геттеры и сеттеры
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

}
