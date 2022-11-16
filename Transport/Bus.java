package Transport;

 public abstract class Bus extends Transport implements Competing {
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

     private double engineVolume;
     public static final int[] bestLapTime = new int[4];
     public static final int[] maximumSpeed = new int[4];
     public Bus(String brand, String model, double engineVolume) {
         super(brand, model);
         if (Double.compare(engineVolume, 0.0) == 0) {
             this.engineVolume = 6.9;
         } else {
             this.engineVolume = engineVolume;
         }
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
     public int[] getBestLapTime() {
         return bestLapTime;
     }

     @Override
     public int[] getMaximumSpeed() {
         return maximumSpeed;
     }
 }


