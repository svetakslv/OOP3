package Driver;

import Transport.Car;

public abstract class DriverB extends Driver <Car> {

    public DriverB(String fullName, String license, int experience, String car) {
        super("Иванов Иван", "B", 10, "lexus");
    }
    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String getLicense() {
        return super.getLicense();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
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
}


