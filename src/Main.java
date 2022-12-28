public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "автомат", "седан", "А123АА", 5);
        System.out.println(ladaGranta);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "механика", "хетчбек", "А123АА", 5);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "автомат", "кабриолет", "А123АА", 3);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "автомат", "седан", "Б456ББ", 5);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "механика", "автомат", "В789ВВ", 5);
        System.out.println(hyundai);

        kia.getChangeTires(5);
        bmw.getChangeTires(12);

        Car.Key key = new Car.Key(true, false);
    }
}