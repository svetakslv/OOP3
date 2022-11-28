package Driver;

import Transport.Trucks;

public class DriverC extends Driver <Trucks> {

    public DriverC(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
        if (license == Boolean.parseBoolean("C")) {
            this.license = true;
        } else {
            this.license = false;
        }
    }
        @Override
        public void startMoving () {
            super.startMoving();
        }

        @Override
        public void stopMoving () {
            super.stopMoving();
        }

        @Override
        public void refueling () {
            super.refueling();
        }

        public void driveTrucks (Trucks truck){
            System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.",
                    this.fullName,
                    truck.getModel(),
                    truck.getBrand());
        }
    }



