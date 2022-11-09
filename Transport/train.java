package Transport;

public class train extends transport {
    public int priceOfTrip;
    public double travelTime;
    private String station;
    private String finalStop;
    public int wagons;

    public train(String brand, String model, int productionYear, String productionCountry,
                 String color, int speed, int priceOfTrip, double travelTime, String station, String finalStop, int wagons) {
        super(brand, model, productionYear, productionCountry, color, speed);

        if (priceOfTrip <= 0) {
            this.priceOfTrip = 2500;
        }else {
            this.priceOfTrip = priceOfTrip;
        }
        if (travelTime <= 0) {
            this.travelTime = 8;
        }else {
            this.travelTime = travelTime;
        }
        this.station = station;
        this.finalStop = finalStop;
        this.wagons = wagons;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(int priceOfTrip) {
        if (priceOfTrip <= 0) {
            this.priceOfTrip = 2500;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime <= 0) {
            this.travelTime = 8;
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getStation() {
        return station;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public void printTrain() {
        System.out.println("Поезд " + getBrand() + " " + "модель " + getModel() + ", " + getProductionYear() +
                " год выпуска в " + getProductionCountry() + ", цвет вагона: " + getColor() + ", скорость передвижения - " + getSpeed() +
                " , отходит от " + getStation() + " и следует до станции " + getFinalStop() + ". Цена поездки - " + getPriceOfTrip() + ", в поезде " + getWagons() + " вагонов.");

    }

    public void refill() {
        System.out.println("Заправка дизелем");
    }
}
