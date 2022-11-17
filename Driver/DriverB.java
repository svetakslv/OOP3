package Driver;

import Transport.Car;

public class DriverB extends Driver <Car> {

    public DriverB(String fullName, String license, int experience, String car) {
        super("Иванов Иван", "B", 10, "Lexus LC 500");
    }

    @Override
    public void getModel() {
        getModel();
    }

    @Override
    public String getBrand() {
        return getBrand();
    }

 /*   public void printDriverB() {
        System.out.println("Водитель " + fullName + " управляет автомобилем" + getBrand() + getModel() + " и будет учавствовать в заезде");
    }*/
}


