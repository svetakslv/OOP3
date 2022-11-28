package Driver;

import Transport.Car;

public class DriverB extends Driver <Car> {

    public DriverB(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
        if(license == Boolean.parseBoolean("B")) {
            this.license = true;
        }else{
            this.license = false;
        }
    }


    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void stopMoving() {
        super.stopMoving();
    }

    @Override
    public void refueling() {
        super.refueling();
    }

    public void driveCar(Car car) {
        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.",
                this.fullName,
                car.getModel(),
                car.getBrand());
    }
}


