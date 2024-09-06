public class Bicycle implements Vehicle {
    private String modelName;
    private int wheelsCount;

    //задаём конструктор
    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    //задаём геттеры и сеттеры
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


    // Реализация методов интерфейса Vehicle
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

    @Override
    public void checkEngine() {
        System.out.println("У велосипеда нет двигателя");
    }
    //ОБРАЩАЮ ВНИМАНИЕ! У большинства великов прицепа нет,но существуют такие,что-есть
    //но т.к. у большинства великов есть корзины для клади-то для чистоты работы
    //будем считать,что нет
    @Override
    public  void checkTrailer(){
        System.out.println("У велосипеда нет прицепа");
    }
}
