public class Car extends EngineTransport {
    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void service() {
        System.out.println(getModelName());
        super.updateTyre();
        super.checkEngine();
    }
}
