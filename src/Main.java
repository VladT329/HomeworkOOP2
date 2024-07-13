public class Main {
    public static void main(String[] args) {
        Transportable bicycle1 = new Bicycle("bicycle1");
        Transportable bicycle2 = new Bicycle("bicycle2");
        Transportable car1 = new Car("car1");
        Transportable car2 = new Car("car2");
        Transportable truck1 = new Truck("truck1", 6);
        Transportable truck2 = new Truck("truck2", 8);

        Transportable[] transports = {bicycle1, bicycle2, car1, car2, truck1, truck2};

        ServiceStation station = new ServiceStation();
        for (Transportable transport : transports) {
            station.service(transport);
        }
    }
}
