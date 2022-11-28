package Driver;

import Transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
        if(license == Boolean.parseBoolean("D")) {
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

    public void driveBus(Bus bus) {
        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.",
                this.fullName,
                bus.getModel(),
                bus.getBrand());
    }
    }

