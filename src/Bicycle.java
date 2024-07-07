public class Bicycle extends Transport {

    public Bicycle(String modelName, Boolean engine, Boolean trailer) {
        super(modelName, engine, trailer);
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
