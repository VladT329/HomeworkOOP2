public class Transport implements Actions{

    private String modelName;
    private int wheelsCount;
    private static Boolean engine;
    private Boolean trailer;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Transport(String modelName, Boolean engine, Boolean trailer) {
        this.modelName = modelName;
        this.engine = engine;
        this.trailer = trailer;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String getModelName(){
        return modelName;
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public void checkEngine() {
        if (engine == false) {
            System.out.println("На транспорте нет двигателя");
        } else {
            System.out.println("Проверяем двигатель");
        }
    }


    public void checkTrailer() {
        if (trailer == false) {
            System.out.println("На транспорте нет прицепа");
        } else {
            System.out.println("Проверяем прицеп");
        }
    }

    public void checkBicycle (Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void checkCar (Car car){
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void checkTruck (Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}
