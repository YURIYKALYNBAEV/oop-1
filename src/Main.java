public class Main {
    public static void main(String[] args) {
//        task1();
        task2();


    }
 /*  public static void task1() {
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engine = 1.7;
        ladaGranta.color = "желтый";
        ladaGranta.year = 2015;
        ladaGranta.country = "Россия";
        System.out.println(ladaGranta);

        Car audi  = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engine = 3.0;
        audi.color = "черный";
        audi.year = 2020;
        audi.country = "Германия";
        System.out.println(audi);

        Car bmw  = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engine = 3.0;
        bmw.color = "черный";
        bmw.year = 2021;
        bmw.country = "Германия";
        System.out.println(bmw);

        Car kia   = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engine = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        System.out.println(kia);

        Car hyundai   = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engine = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        System.out.println(hyundai);
    }*/

    public static void task2() {
        Car ladaGranta = new Car("Lada","Granta",1.7,"желтый",2015,"Россия");
        System.out.println(ladaGranta);
        Car audi  = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,
                "Германия");
        System.out.println(audi);
        Car bmw  = new Car("BMW","Z8",3.0,"черный",2021,"Германия");
        System.out.println(bmw);
        Car kia   = new Car("Kia","Sportage 4-го поколения",2.4,"красный",2018,
                "Южная Корея");
        System.out.println(kia);
        Car hyundai   = new Car("Hyundai","Avante",1.6,"оранжевый",2016,
                "Южная Корея");
        System.out.println(hyundai);
    }






}