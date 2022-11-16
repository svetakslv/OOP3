package Transport;

public abstract class Trucks extends Transport implements Competing{
    private double engineVolume;
    public static final int[] bestLapTime = new int[4];
    public static final int[] maximumSpeed = new int[4];

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

    public void start() {
        System.out.printf("Старт %s %s",
                this.getBrand(),
                this.getModel());
    }

    public void finish() {
        System.out.printf("Финиш %s %s",
                this.getBrand(),
                this.getModel());
    }

    public void printTrucks() {
        System.out.println("Марка и модель машины: " + getBrand() + getModel() + " , объемом двигателя: " + getEngineVolume());
    }

    @Override
    public void getPitStop() {
        System.out.printf("Пит-стоп на 2 круге %s %s ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int[] getBestLapTime() {
        return bestLapTime;
    }

    @Override
    public int[] getMaximumSpeed() {
        return maximumSpeed;
    }
}
