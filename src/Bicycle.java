public class Bicycle extends Transport {

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void service() {
        System.out.println(getModelName());
        super.updateTyre();
    }
}