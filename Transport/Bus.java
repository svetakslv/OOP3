package Transport;

 public class Bus extends Transport implements Competing {
     /*    public int ticketPrice;*/
     /*    private String busStation;*/
     /*    private String busFinalStation;*/
     /*    public double busTravelTime;*/
/*     public Bus(String brand, String model, int productionYear, String productionCountry, String color,
                int speed, int ticketPrice, String busStation, String busFinalStation, double busTravelTime) {
         super(brand, model, productionYear, productionCountry, color, speed);
         this.ticketPrice = ticketPrice;
         this.busStation = busStation;
         this.busFinalStation = busFinalStation;
         this.busTravelTime = busTravelTime;
     }*/
/*         public String getBusStation() {
             return busStation;
         }*/
/*         public String getBusFinalStation() {
             return busFinalStation;
         }*/
/*     public int getTicketPrice() {
         return ticketPrice;
     }*/
/*     public void setTicketPrice(int ticketPrice) {
         this.ticketPrice = ticketPrice;
     }*/
/*     public double getBusTravelTime() {
         return busTravelTime;
     }*/
/*     public void setBusTravelTime(double busTravelTime) {
         this.busTravelTime = busTravelTime;
     }*/
/*     public void printBus() {
         System.out.println("Автобус " + getBrand() + " " + "модель " + getModel() + ", " + getProductionYear() +
                 " год выпуска в " + getProductionCountry() + ", цвет : " + getColor() + ", скорость: " + getSpeed() +
                 " , начальная остановка: " + getBusStation() + " и следует до остановки: " + getBusFinalStation() + ". Цена поездки: " + getTicketPrice());

     }*/
/*     public void refill() {
         System.out.println("Заправка бензином или дизелем на заправке");
     }*/
     private Capacity capacity;
     private double engineVolume;
     public static final int SPEED_LIAZ = 85;
     public static final int SPEED_ICARUS = 106;
     public static final int SPEED_MERCEDES = 173;
     public static final int SPEED_HIGER = 120;

     public static final int TIME_LIAZ = 25;
     public static final int TIME_ICARUS = 19;
     public static final int TIME_MERCEDES = 16;
     public static final int TIME_HIGER = 12;
     public static final int[] ALL_MAXIMUM_SPEED_BUS = {SPEED_LIAZ, SPEED_ICARUS, SPEED_MERCEDES, SPEED_HIGER};
     private int[] ALL_LAP_TIME_BUS = {TIME_LIAZ, TIME_ICARUS, TIME_MERCEDES, TIME_HIGER};
     public Bus(String brand, String model, double engineVolume, Capacity capacity) {
         super(brand, model);
         if (Double.compare(engineVolume, 0.0) == 0) {
             this.engineVolume = 6.9;
         } else {
             this.engineVolume = engineVolume;
         }
     }

     public Capacity getCapacity() {
         return capacity;
     }

     public void setCapacity(Capacity capacity) {
         this.capacity = capacity;
     }

     public double getEngineVolume() {
         return engineVolume;
     }

     public void setEngineVolume(double engineVolume) {
         if (Double.compare(engineVolume, 0.0) == 0) {
             this.engineVolume = 6.9;
         } else {
             this.engineVolume = engineVolume;
         }
     }

/*     public void start() {
         System.out.printf("Старт %s %s",
                 this.getBrand(),
                 this.getModel());
     }

     public void finish() {
         System.out.printf("Финиш %s %s",
                 this.getBrand(),
                 this.getModel());
     }*/

     public void printBus() {
         System.out.println("Марка и модель машины: " + getBrand() + getModel() + " , объемом двигателя: " + getEngineVolume());
     }

     @Override
     public void getPitStop() {
         System.out.printf("Пит-стоп на 4 круге %s %s ",
                 this.getBrand(),
                 this.getModel());
     }

     @Override
     public void getPitStop(String pit_stop) {

     }

     @Override
     public int[] getBestLapTime() {
         return ALL_LAP_TIME_BUS;
     }

     @Override
     public int[] getMaximumSpeed() {
         return ALL_MAXIMUM_SPEED_BUS;
     }

     public void getBestLapTime(int time) {
         switch (time) {
             case TIME_LIAZ:
                 System.out.println("Время: " + TIME_LIAZ + " секунд(ы)");
                 break;
             case TIME_ICARUS:
                 System.out.println("Время: " + TIME_ICARUS + " секунд(ы)");
                 break;
             case TIME_MERCEDES:
                 System.out.println("Время: " + TIME_MERCEDES + " секунд(ы)");
                 break;
             case TIME_HIGER:
                 System.out.println("Время: " + TIME_HIGER + " секунд(ы)");
                 break;
         }

     }

     public void getMaximumSpeed(int speed) {
         switch (speed) {
             case SPEED_LIAZ:
                 System.out.println("Лиаз-4292: " + SPEED_LIAZ + " км/ч");
                 break;
             case SPEED_ICARUS:
                 System.out.println("Icarus 125: " + SPEED_ICARUS + " км/ч");
                 break;
             case SPEED_MERCEDES:
                 System.out.println("Mercedes-Benz Sprinter: " + SPEED_MERCEDES + " км/ч");
                 break;
             case SPEED_HIGER:
                 System.out.println("Higer KLQ 6885: " + SPEED_HIGER + " км/ч");
                 break;
         }
     }
     @Override
     public void printType() {
         if(capacity == null){
             System.out.println("Данных по автомобилю не достаточно");
         }else{
             System.out.println("Вместимость автобуса от: " + capacity.getFrom() + " до: " + capacity.getTo());
         }
     }

     }


