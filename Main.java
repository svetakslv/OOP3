import Transport.Car;
import Transport.train;

public class  Main {


    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", 2015, "Россия", "желтый", 0, 1.7, null, "х000х000", 4, false);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 200, 3.0, null, "х000х000", 0, true);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 190, 3.0, "неизвестно","х000х000", 4, true);
        Car kiaSportage4 = new Car((String) null, "Sportage 4 поколения", 2018, "Южная Корея", "красный", 0, 2.4, null, "х000х000", 4, true);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180, 1.6, "неизвестно", "х000х000", 0, false);

        ladaGrande.printCar();
        audiA8.printCar();
        bmwZ8.printCar();
        kiaSportage4.printCar();
        hyundaiAvante.printCar();


        train lastochka = new train("Ласточка", "В-901", 2011, "России", null, 301, 3500, 6.55, "Белорусский вокзал", "Минск - Пассажирский", 11);
        train leningrad = new train("Ленинград", "D-125", 2019, "России", null, 270, 1700, 8.49, "Ленинградский вокзал","Ленинград - Пассажирский",8);

        lastochka.printTrain();
        leningrad.printTrain();


    }
}


