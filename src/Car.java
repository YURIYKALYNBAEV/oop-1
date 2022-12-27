public class Car {
    String brand;
    String model;
    double engine;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return "марка:" + brand +
                ", модель:" + model +
                ", объем двигателя в литрах:" + engine +
                ", цвет:" + color +
                ", год производства:" + year +
                ", страна сборки:" + country;
    }

    /**
     * Конструктор класса Car
     * @param brand - марка
     * @param model - модель
     * @param engine - объем двигателя
     * @param color - цвет
     * @param year - год производства
     * @param country - страна сборки
     */
    public Car(String brand, String model, double engine, String color, int year, String country) {

        if (brand == "" || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == "" || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engine <= 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
        if (color == "" || color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == "" || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }
}
