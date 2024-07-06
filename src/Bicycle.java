public class Bicycle extends Transport {

    public Bicycle(String modelName) {
        super(modelName);
        setWheelsCount(2);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }
}
