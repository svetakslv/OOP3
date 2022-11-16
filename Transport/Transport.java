package Transport;

public abstract class Transport{
    public String brand;
    public String model;
/*    protected int productionYear;*/
/*    protected String productionCountry;*/
/*    protected String color;*/
/*    public int speed;*/

    public Transport(String brand, String model) {
        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
       }
    }

    /*    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int speed) {
        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (speed <= 0) {
                this.speed = 0;
            } else {
                this.speed = speed;
            }
        }*/

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

/*    public int getProductionYear () {
            return productionYear;
        }*/

/*        public String getProductionCountry () {
            return productionCountry;
        }*/

/*        public String getColor () {
            return color;
        }*/


/*        public void setColor (String body){
            if (body == null) {
                this.color = "белый";
            } else {
                this.color = body;
            }
        }*/


/*        public int getSpeed () {
            return speed;
        }*/


/*        public void setSpeed (int speed){
            if (speed <= 0) {
                this.speed = 0;
            } else {
                this.speed = speed;
            }
        }*/

    /*        public abstract void refill();*/
    public void start() {
    }

    public void finish() {
    }

    public abstract void getPitStop();

    public void startMoving() {
    }

    public void stopMoving() {
    }

    public abstract void printB();
    public abstract void printC();
    public abstract void printD();

}
