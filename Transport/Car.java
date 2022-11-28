package Transport;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;
    private double engineVolume;
    public static final int SPEED_LEXUS = 270;
    public static final int SPEED_FORD = 290;
    public static final int SPEED_BMW = 250;
    public static final int SPEED_CHEVROLETE = 240;

    public static final int TIME_LEXUS = 3;
    public static final int TIME_FORD = 2;
    public static final int TIME_BMW = 4;
    public static final int TIME_CHEVROLETE = 5;
    public static final int[] ALL_MAXIMUM_SPEED = {SPEED_LEXUS, SPEED_FORD, SPEED_BMW, SPEED_CHEVROLETE};
    private int[] ALL_LAP_TIME = {TIME_LEXUS, TIME_FORD, TIME_BMW, TIME_CHEVROLETE};

    // private String transmission;
    // private String regNumber;
    // protected int seats;
    // protected boolean rubberSum;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model);
        this.typeOfBody = typeOfBody;
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

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody (TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    /*    public void setEngineVolume(double engineVolume) {
            if (Double.compare(engineVolume, 0.0) == 0) {
                this.engineVolume = 1.5;
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
    public void printCar() {
        System.out.println("Марка и модель машины: " + getBrand() + getModel() + " , объемом двигателя: " + getEngineVolume());
    }

    @Override
    public void getPitStop() {
        System.out.printf("Пит-стоп на 3 круге %s %s ",
                this.getBrand(),
                this.getModel());

    }

    @Override
    public void getPitStop(String pit_stop) {

    }

    @Override
    public int[] getBestLapTime() {
        return ALL_LAP_TIME;
    }

    @Override
    public int[] getMaximumSpeed() {
        return ALL_MAXIMUM_SPEED;
    }

    @Override
    public void getBestLapTime(int time) {
        switch (time) {
            case TIME_LEXUS:
                System.out.println("Время: " + TIME_LEXUS + " секунд(ы)");
                break;
            case TIME_FORD:
                System.out.println("Время: " + TIME_FORD + " секунд(ы)");
                break;
            case TIME_BMW:
                System.out.println("Время: " + TIME_BMW + " секунд(ы)");
                break;
            case TIME_CHEVROLETE:
                System.out.println("Время: " + TIME_CHEVROLETE + " секунд(ы)");
                break;
        }

    }

    public void getMaximumSpeed(int speed) {
        switch (speed) {
            case SPEED_LEXUS:
                System.out.println("Lexus LC 500: " + SPEED_LEXUS + " км/ч");
                break;
            case SPEED_FORD:
                System.out.println("Ford Mustang Shelby GT500: " + SPEED_FORD + " км/ч");
                break;
            case SPEED_BMW:
                System.out.println("BMW i8: " + SPEED_BMW + " км/ч");
                break;
            case SPEED_CHEVROLETE:
                System.out.println("Chevrolet Camaro: " + SPEED_CHEVROLETE + " км/ч");
                break;
        }
    }
    @Override
    public void printType() {
        if(typeOfBody == null){
            System.out.println("Данных по автомобилю не достаточно");
        }else{
            System.out.println("Тип кузова автомобиля - " + typeOfBody);
        }
    }

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

