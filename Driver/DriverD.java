package Driver;

import Transport.Bus;

public abstract class DriverD extends Driver <Bus> {

    public DriverD(String fullName, String license, int experience, String car) {
        super("Волков Алексей", "D", 17, "liaz");
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
