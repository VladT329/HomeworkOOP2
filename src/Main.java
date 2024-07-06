public class Main {
        public static void main(String[] args) {

            Transport car = new Car("car1");
            Transport car2 = new Car("car2");

            Transport truck = new Truck("truck1", 6);
            Transport truck2 = new Truck("truck2", 8);

            Transport bicycle = new Bicycle("bicycle1");
            Transport bicycle2 = new Bicycle("bicycle2");

            ServiceStation station = new ServiceStation();
            station.check(car, null, null);
            station.check(car2, null, null);
            station.check(null, bicycle, null);
            station.check(null, bicycle2, null);
            station.check(null, null, truck);
            station.check(null, null, truck2);
        }
}
