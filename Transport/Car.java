package Transport;

public class Car extends Transport {
    private double engineVolume;
   // private String transmission;
   // private String regNumber;
   // protected int seats;
   // protected boolean rubberSum;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model);
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }


/*    public Car(String brand, String model, int productionYear, String productionCountry, String color, int speed,
               double engineVolume, String transmission, String regNumber, int seats, boolean rubberSum) {
        super(brand, model, productionYear, productionCountry, color, speed);

        if (transmission == null) {
            this.transmission = "АКПП";
        }else{
            this.transmission = "МКПП";
        }
        this.regNumber = "х000х000";
        if (seats <= 0) {
            this.seats = 5;
        }else{
            this.seats = 4;
        }
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

    }*/

/*
    public int getSeats() {
        return this.seats;
    }
*/

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0.0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void start() {
        System.out.println("3, 2, 1!");
    }
    public void finish() {
        System.out.println("Первым финиширует Ford Mustang Shelby GT500, с небольшим отрывом");
    }

    public void printCar() {
        System.out.println("Марка и модель машины: " + getBrand() + getModel() + " , объемом двигателя: " + getEngineVolume());
    }
    /*   public String getTransmission() {
        return this.transmission;
    }
*/
/*   public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "АКПП";
        } else {
            this.transmission = transmission;
        }

    }*/

/*      public String getRegNumber() {
        return this.regNumber;
    }*/

/*    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000х000";
        } else {
            this.regNumber = regNumber;
        }

    }*/

/*   public boolean isRubberSum() {
        return setRubberSum();
    }*/

/*
    public boolean setRubberSum() {
        if (rubberSum == false) {
            this.rubberSum = !rubberSum;
        }else{
            this.rubberSum = false;
        }
        return this.rubberSum;
    }
*/


/*    public boolean correctRegNumber() {
        if (this.regNumber.length() != 8) {
            return false;
        } else {
            char[] chars = this.regNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) && Character.isAlphabetic(chars[4])) {
                return false;
            } else {
                return Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[5]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]);
            }
        }
    }*/

/*    public void printCar() {
        System.out.println("Модель и марка машины: " + getBrand() + " " + getModel() +
                ",  год выпуска: " + getProductionYear() + ",  страна сборки: " + getProductionCountry() + " цвет: " + getColor() +
                ",  объем двигателя - " + getEngineVolume() + ", коробка передач: " + getTransmission() + ", регистрационный номер: "
                + correctRegNumber() + ", количество мест: " + getSeats() + ", летняя или зимняя резина: " + isRubberSum());
    }*/

/*    public void refill() {
        System.out.println("Заправка бензином или дизелем на заправке");
        System.out.println("Зарядка на электроду-парковке, если электрокар");
    }*/

}
