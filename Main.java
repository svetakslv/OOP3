import Transport.Bus;
import Transport.Car;
import Transport.Trucks;

public class  Main {

    public static void main(String[] args) {
/*        Car ladaGrande = new Car("Lada", "Grande", 2015, "Россия", "желтый", 0, 1.7, null, "х000х000", 4, false);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 200, 3.0, null, "х000х000", 0, true);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 190, 3.0, "неизвестно","х000х000", 4, true);
        Car kiaSportage4 = new Car((String) null, "Sportage 4 поколения", 2018, "Южная Корея", "красный", 0, 2.4, null, "х000х000", 4, true);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180, 1.6, "неизвестно", "х000х000", 0, false);

        ladaGrande.printCar();
        audiA8.printCar();
        bmwZ8.printCar();
        kiaSportage4.printCar();
        hyundaiAvante.printCar();

        ladaGrande.refill();
        audiA8.refill();
        bmwZ8.refill();
        kiaSportage4.refill();
        hyundaiAvante.refill();

        System.out.println(" ");*/
/*        Train lastochka = new Train("Ласточка", "В-901", 2011, "России", null, 301, 3500, 6.55, "Белорусский вокзал", "Минск - Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", null, 270, 1700, 8.49, "Ленинградский вокзал","Ленинград - Пассажирский",8);

        lastochka.printTrain();
        leningrad.printTrain();

        lastochka.refill();
        leningrad.refill();

        System.out.println(" ");*/
/*        Bus gaz = new Bus("Газель NEXT", "A65R25-60", 2021,"России", "черный", 120, 30, "Академика Сахарова", "Московский вокзал", 1.35);
        Bus liaz = new Bus("Лиаз-", "5292 рестайлинг", 2020, "России", "голубой", 90, 28, "Кузнечиха-2", "Площадь Горького", 1.5);
        Bus man = new Bus("MAN", "49", 2018, "России", "белый", 80, 2000, "Чебоксары", "Казань", 3);

        gaz.printBus();
        liaz.printBus();
        man.printBus();

        gaz.refill();
        liaz.refill();
        man.refill();*/


        Car lexus = new Car("Lexus", " LC 500", 5.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Car ford = new Car("Ford", " Mustang Shelby GT500", 5.2) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Car bmw = new Car("BMW", " i8", 1.5) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Car chevrolet = new Car("Chevrolet", " Camaro", 2.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };

        Trucks man = new Trucks("MAN", " TGL", 6.9) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Trucks volvo = new Trucks("Volvo", " FH", 12.8) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Trucks scania = new Trucks("Scania", " R500", 16.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Trucks kamaz = new Trucks("Камаз", " 6520", 11.8) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };

        Bus liaz = new Bus("Лиаз-", " 4292", 4.43) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Bus icarus = new Bus("Icarus", " 125", 7.7) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Bus mercedes = new Bus("Mercedes-Benz", " Sprinter", 3.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };
        Bus higer = new Bus("Higer", " KLQ 6885", 6.7) {
            @Override
            public void getPitStop(String pit_stop) {
            }

            @Override
            public int[] getBestLapTime() {
                return super.getBestLapTime();
            }

            @Override
            public int[] getMaximumSpeed() {
                return super.getMaximumSpeed();
            }
        };

        lexus.printCar();
        lexus.getPitStop();
        lexus.getBestLapTime();
        lexus.getMaximumSpeed();
        System.out.println();
        System.out.println();

        ford.printCar();
        ford.getPitStop();
        ford.getBestLapTime();
        ford.getMaximumSpeed();
        System.out.println();
        System.out.println();

        bmw.printCar();
        bmw.getPitStop();
        bmw.getBestLapTime();
        bmw.getMaximumSpeed();
        System.out.println();
        System.out.println();

        chevrolet.printCar();
        chevrolet.getPitStop();
        chevrolet.getBestLapTime();
        chevrolet.getMaximumSpeed();
        System.out.println();
        System.out.println();

        man.printTrucks();
        man.getPitStop();
        man.getBestLapTime();
        man.getMaximumSpeed();
        System.out.println();
        System.out.println();

        volvo.printTrucks();
        volvo.getPitStop();
        volvo.getBestLapTime();
        volvo.getMaximumSpeed();
        System.out.println();
        System.out.println();

        scania.printTrucks();
        scania.getPitStop();
        scania.getBestLapTime();
        scania.getMaximumSpeed();
        System.out.println();
        System.out.println();

        kamaz.printTrucks();
        kamaz.getPitStop();
        kamaz.getBestLapTime();
        kamaz.getMaximumSpeed();
        System.out.println();
        System.out.println();

        liaz.printBus();
        liaz.getPitStop();
        liaz.getBestLapTime();
        liaz.getMaximumSpeed();
        System.out.println();
        System.out.println();

        icarus.printBus();
        icarus.getPitStop();
        icarus.getBestLapTime();
        icarus.getMaximumSpeed();
        System.out.println();
        System.out.println();

        mercedes.printBus();
        mercedes.getPitStop();
        mercedes.getBestLapTime();
        mercedes.getMaximumSpeed();
        System.out.println();
        System.out.println();

        higer.printBus();
        higer.getPitStop();
        higer.getBestLapTime();
        higer.getMaximumSpeed();
        System.out.println();
        System.out.println();

    }
}


