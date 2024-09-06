public class Truck implements Vehicle{
    private String modelName;
    private int wheelsCount;
    private String engine;
    private String trailer;
    //реализуем конструктор
    public Truck(String modelName,int wheelsCount,String engine,String trailer){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
        this.engine=engine;
        this.trailer=trailer;
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
    public  String getEngine(){
        return engine;
    }
    public String setEngine(){
        return engine;
    }
    public String getTrailer(){
        return trailer;
    }
    public String setTrailer(){
        return trailer;
    }
    // Реализация методов интерфейса Vehicle
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }

    @Override
    public void checkEngine() {
        System.out.println("Двигатель проверен");
    }
    @Override
    public  void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

}


