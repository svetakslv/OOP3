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


    public void startMoving() {
        System.out.printf("Водитель %s начал движение", this.fullName);
    }

    public void stopMoving() {
        System.out.printf("Водитель %s остановился", this.fullName);
    }

    public void refueling() {
        System.out.printf("Водитель %s заправляется", this.fullName);
    }

    public void getModel() {
        getModel();
    }

    public String getBrand() {
        return getBrand();
    }

    @Override
    public String toString() {
        return "Водитель " + fullName +
                " управляет автомобилем " + car +
                " и будет учавствовать в заезде";
    }
}
