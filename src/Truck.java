public class Truck extends EngineTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println(getModelName());
        super.updateTyre();
        super.checkEngine();
        super.checkTrailer();
    }
}
