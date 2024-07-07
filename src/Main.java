public class Main {
        public static void main(String[] args) {

            Transport car = new Car("car1", true, false);
            Transport car2 = new Car("car2", true, false);

            Transport truck = new Truck("truck1", 6);
            Transport truck2 = new Truck("truck2", 8);

            TransportWithoutEngine bicycle = new Bicycle("bicycle1");
            TransportWithoutEngine bicycle2 = new Bicycle("bicycle2");

            ServiceStation station = new ServiceStation();
            station.checkCar(car);
            station.checkCar(car2);
            station.checkBicycle(bicycle);
            station.checkBicycle(bicycle2);
            station.checkTruck(truck);
            station.checkTruck(truck2);
        }
}
