package Transport;

public class Truck extends Transport implements Competing{
    private LoadCapacity loadCapacity;
    private double engineVolume;
    public static final int SPEED_MAN = 100;
    public static final int SPEED_VOLVO = 90;
    public static final int SPEED_SCANIA = 85;
    public static final int SPEED_KAMAZ = 95;

    public static final int TIME_MAN = 10;
    public static final int TIME_VOLVO = 12;
    public static final int TIME_SCANIA = 14;
    public static final int TIME_KAMAZ = 11;
    public static final int[] ALL_MAXIMUM_SPEED_TRUCKS = {SPEED_MAN, SPEED_VOLVO, SPEED_SCANIA, SPEED_KAMAZ};
    private int[] ALL_LAP_TIME_TRUCKS = {TIME_MAN, TIME_VOLVO, TIME_SCANIA, TIME_KAMAZ};

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 3.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

/*    public void setEngineVolume(double engineVolume) {
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
    }*/

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
    public void getPitStop(String pit_stop) {

    }

    @Override
    public int[] getBestLapTime() {
        return ALL_LAP_TIME_TRUCKS;
    }

    @Override
    public int[] getMaximumSpeed() {
        return ALL_MAXIMUM_SPEED_TRUCKS;
    }

    public void getBestLapTime(int time) {
        switch (time) {
            case TIME_MAN:
                System.out.println("Время: " + TIME_MAN + " секунд(ы)");
                break;
            case TIME_VOLVO:
                System.out.println("Время: " + TIME_VOLVO + " секунд(ы)");
                break;
            case TIME_SCANIA:
                System.out.println("Время: " + TIME_SCANIA + " секунд(ы)");
                break;
            case TIME_KAMAZ:
                System.out.println("Время: " + TIME_KAMAZ + " секунд(ы)");
                break;
        }

    }

    public void getMaximumSpeed(int speed) {
        switch (speed) {
            case SPEED_MAN:
                System.out.println("MAN TGL: " + SPEED_MAN + " км/ч");
                break;
            case SPEED_VOLVO:
                System.out.println("Volvo FH: " + SPEED_VOLVO + " км/ч");
                break;
            case SPEED_SCANIA:
                System.out.println("Scania R500: " + SPEED_SCANIA + " км/ч");
                break;
            case SPEED_KAMAZ:
                System.out.println("Камаз 6520: " + SPEED_KAMAZ + " км/ч");
                break;
        }
    }

    @Override
    public void printType() {
        if(loadCapacity == null){
            System.out.println("Данных по автомобилю не достаточно");
        }else{
                String from = loadCapacity.getFrom() == null ? "" : " от " + loadCapacity.getFrom();
                String to = loadCapacity.getTo() == null ? "" : " от " + loadCapacity.getTo();
            System.out.println("Тип грузоподъемности - " + from + to);
        }
    }

}
