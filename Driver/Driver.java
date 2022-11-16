package Driver;

import Transport.Transport;

public abstract class Driver <T extends Transport> {
    protected final String fullName;
    private final String license;
    private final int experience;
    protected final String car;
    

    protected Driver(String fullName, String license, int experience, String car) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public void startMoving() {
        System.out.printf("Водитель %s начал движение", this.fullName);
    }

    public void stopMoving() {
        System.out.printf("Водитель %s остановился", this.fullName);
    }

    public void refueling() {
        System.out.printf("Водитель %s заправляется", this.fullName);
    }

    @Override
    public String toString() {
        return "Водитель " + getFullName() + " управляет автомобилем " + getBrand() + getModel() + " и будет учавствовать в заезде";
    }

    protected abstract String getModel();

    protected abstract String getBrand();
    

}
