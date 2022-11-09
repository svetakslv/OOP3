import Transport.car;
import Transport.bus;
import Transport.train;

public class  Main {

        public static void main(String[] args) {
        car ladaGrande = new car("Lada", "Grande", 2015, "Россия", "желтый", 0, 1.7, null, "х000х000", 4, false);
        car audiA8 = new car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 200, 3.0, null, "х000х000", 0, true);
        car bmwZ8 = new car("BMW", "Z8", 2021, "Германия", "черный", 190, 3.0, "неизвестно","х000х000", 4, true);
        car kiaSportage4 = new car((String) null, "Sportage 4 поколения", 2018, "Южная Корея", "красный", 0, 2.4, null, "х000х000", 4, true);
        car hyundaiAvante = new car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180, 1.6, "неизвестно", "х000х000", 0, false);

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

        System.out.println(" ");


        train lastochka = new train("Ласточка", "В-901", 2011, "России", null, 301, 3500, 6.55, "Белорусский вокзал", "Минск - Пассажирский", 11);
        train leningrad = new train("Ленинград", "D-125", 2019, "России", null, 270, 1700, 8.49, "Ленинградский вокзал","Ленинград - Пассажирский",8);

        lastochka.printTrain();
        leningrad.printTrain();

        lastochka.refill();
        leningrad.refill();

        System.out.println(" ");


        bus gaz = new bus("Газель NEXT", "A65R25-60", 2021,"России", "черный", 120, 30, "Академика Сахарова", "Московский вокзал", 1.35);
        bus liaz = new bus("Лиаз-", "5292 рестайлинг", 2020, "России", "голубой", 90, 28, "Кузнечиха-2", "Площадь Горького", 1.5);
        bus man = new bus("MAN", "49", 2018, "России", "белый", 80, 2000, "Чебоксары", "Казань", 3);

        gaz.printBus();
        liaz.printBus();
        man.printBus();

        gaz.refill();
        liaz.refill();
        man.refill();

    }
}


