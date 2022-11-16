package Driver;

import Transport.Trucks;

public abstract class DriverC extends Driver <Trucks>{

    public DriverC(String fullName, String license, int experience, String car) {
        super("Наумов Николай", "C", 7, "man");
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

