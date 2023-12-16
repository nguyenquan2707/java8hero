package quan.defaultMethod;

interface Vehicle {
    String getBrand();

    String speedUp();

    default String turnAlarmOn() {
        return "speed down...";
    }
}

class VehicleImpl implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "40km";
    }
}

public class DefaultDemo {

    public static void main(String[] args) {
        //default
        System.out.println(new VehicleImpl().turnAlarmOn());

        System.out.println(new VehicleImpl().getBrand());
        System.out.println(new VehicleImpl().speedUp());
    }
}
