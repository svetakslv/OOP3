package Transport;

public class Trucks extends Transport {
    private double engineVolume;

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model);
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 3.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 3.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public static void start() {
        System.out.println("Все из прицепа убрали?");

    }

    public static void finish() {
        System.out.println("Явный победитель Scania R500");

    }

    public void printTrucks() {
        System.out.println("Марка и модель машины: " + getBrand() + getModel() + " , объемом двигателя: " + getEngineVolume());
    }
}
