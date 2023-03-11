public class ServiceStation {
    public void generalCheck(Transport transport) {

        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }

    public void check(Bicycle bicycle) {
        generalCheck(bicycle);
    }

    public void check(Car car) {
        generalCheck(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        generalCheck(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
}



