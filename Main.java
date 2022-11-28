import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Competing;
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
        };

        Car ford = new Car("Ford", " Mustang Shelby GT500", 5.2) {

            @Override
            public void getPitStop(String pit_stop) {
            }
        };
        Car bmw = new Car("BMW", " i8", 1.5) {

            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Car chevrolet = new Car("Chevrolet", " Camaro", 2.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

        };

        Trucks man = new Trucks("MAN", " TGL", 6.9) {


            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Trucks volvo = new Trucks("Volvo", " FH", 12.8) {
            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Trucks scania = new Trucks("Scania", " R500", 16.0) {
            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Trucks kamaz = new Trucks("Камаз", " 6520", 11.8) {

            @Override
            public void getPitStop(String pit_stop) {
            }

        };

        Bus liaz = new Bus("Лиаз-", " 4292", 4.43) {

            @Override
            public void getPitStop(String pit_stop) {
            }

        };

        Bus icarus = new Bus("Icarus", " 125", 7.7) {

            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Bus mercedes = new Bus("Mercedes-Benz", " Sprinter", 3.0) {

            @Override
            public void getPitStop(String pit_stop) {
            }

        };
        Bus higer = new Bus("Higer", " KLQ 6885", 6.7) {


            @Override
            public void getPitStop(String pit_stop) {
            }

        };

        lexus.printCar();
        lexus.getPitStop();
        System.out.println();
        System.out.println();

        ford.printCar();
        ford.getPitStop();
        System.out.println();
        System.out.println();

        bmw.printCar();
        bmw.getPitStop();
        System.out.println();
        System.out.println();

        chevrolet.printCar();
        chevrolet.getPitStop();
        System.out.println();
        System.out.println();

        man.printTrucks();
        man.getPitStop();
        System.out.println();
        System.out.println();

        volvo.printTrucks();
        volvo.getPitStop();
        System.out.println();
        System.out.println();

        scania.printTrucks();
        scania.getPitStop();
        System.out.println();
        System.out.println();

        kamaz.printTrucks();
        kamaz.getPitStop();
        System.out.println();
        System.out.println();

        liaz.printBus();
        liaz.getPitStop();
        System.out.println();
        System.out.println();

        icarus.printBus();
        icarus.getPitStop();
        System.out.println();
        System.out.println();

        mercedes.printBus();
        mercedes.getPitStop();
        System.out.println();
        System.out.println();

        higer.printBus();
        higer.getPitStop();
        System.out.println();
        System.out.println();


        System.out.println("Легковые автомобили, максимальная скорость: ");
        lexus.getMaximumSpeed(Car.SPEED_LEXUS);
        ford.getMaximumSpeed(Car.SPEED_FORD);
        bmw.getMaximumSpeed(Car.SPEED_BMW);
        chevrolet.getMaximumSpeed(Car.SPEED_CHEVROLETE);
//        checkCompetingsSpeed(lexus, ford, bmw, chevrolet);
        System.out.println("Лучшее время: ");
        lexus.getBestLapTime(Car.TIME_LEXUS);
        ford.getBestLapTime(Car.TIME_FORD);
        bmw.getBestLapTime(Car.TIME_BMW);
        chevrolet.getBestLapTime(Car.TIME_CHEVROLETE);
//        checkCompetingsTime(lexus, ford, bmw, chevrolet);
        System.out.println();
        System.out.println("Грузовые автомобили, максимальная скорость: ");
        man.getMaximumSpeed(Trucks.SPEED_MAN);
        volvo.getMaximumSpeed(Trucks.SPEED_VOLVO);
        scania.getMaximumSpeed(Trucks.SPEED_SCANIA);
        kamaz.getMaximumSpeed(Trucks.SPEED_KAMAZ);
        System.out.println("Лучшее время: ");
        man.getBestLapTime(Trucks.TIME_MAN);
        volvo.getBestLapTime(Trucks.TIME_VOLVO);
        scania.getBestLapTime(Trucks.TIME_SCANIA);
        kamaz.getBestLapTime(Trucks.TIME_KAMAZ);

        System.out.println();
        System.out.println("Автобусы, максимальная скорость: ");
        liaz.getMaximumSpeed(Bus.SPEED_LIAZ);
        icarus.getMaximumSpeed(Bus.SPEED_ICARUS);
        mercedes.getMaximumSpeed(Bus.SPEED_MERCEDES);
        higer.getMaximumSpeed(Bus.SPEED_HIGER);
        System.out.println("Лучшее время: ");
        liaz.getBestLapTime(Bus.TIME_LIAZ);
        icarus.getBestLapTime(Bus.TIME_ICARUS);
        mercedes.getBestLapTime(Bus.TIME_MERCEDES);
        higer.getBestLapTime(Bus.TIME_HIGER);
        System.out.println();



        DriverB ivan = new DriverB("Иван",true,10);
        ivan.driveCar(chevrolet);
        System.out.println();

        DriverC nikolai = new DriverC("Николай",true, 17);
        nikolai.driveTrucks(scania);
        System.out.println();

        DriverD aleksei = new DriverD("Алексей",true, 6);
        aleksei.driveBus(higer);
        System.out.println();

    }

    public static void checkCompetingsSpeed(Competing ... transports) {
        for (Competing transport : transports) {
            for (int speed : transport.getMaximumSpeed()) {
                transport.getMaximumSpeed(speed);
            }
        }
    }

        public static void checkCompetingsTime (Competing ...transports){
            for (Competing transport : transports) {
                for (int time : transport.getBestLapTime()) {
                    transport.getBestLapTime(time);
                }
            }
        }
    }



