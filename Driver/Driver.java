package Driver;

import Transport.Transport;

public  class Driver <T extends Transport> {
    protected final String fullName;
    public boolean license;
    private final int experience;
    

    public Driver(String fullName, boolean license, int experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.printf("Водитель %s начал движение", this.fullName);
    }

    public void stopMoving() {
        System.out.printf("Водитель %s остановился", this.fullName);
    }

    public void refueling() {
        System.out.printf("Водитель %s заправляет автомобиль", this.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void getModel() {
        getModel();
    }

    public String getBrand() {
        return getBrand();
    }

    }

