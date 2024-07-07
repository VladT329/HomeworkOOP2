public class Car extends Transport{

    public Car(String modelName, Boolean engine, Boolean trailer) {
        super(modelName, engine, trailer);
        setWheelsCount(4);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }
}
