public class Car {

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    private final String brand;
    private final String model;
    private double engine;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String bodyType;
    private final String registrationNumber;
    private final int numberSeats;
    private boolean summerOrWinterTires = false;
    private int monthNumber = 1;
    private Key key;

    @Override
    public String toString() {
        return brand +
                " " + model +
                " " + engine +
                " " + color +
                " " + year +
                " " + country +
                " " + gearBox +
                " " + bodyType +
                " " + registrationNumber +
                " " + numberSeats;
    }

    /**
     * Конструктор класса Car
     *
     * @param brand              - марка
     * @param model              - модель
     * @param engine             - объем двигателя
     * @param color              - цвет
     * @param year               - год производства
     * @param country            - страна сборки
     * @param gearBox            - коробка передач
     * @param bodyType           - тип кузова
     * @param registrationNumber - рег.номер
     * @param numberSeats        - кол-во мест
     * @param -                  признак "Летняя" или "Зимняя" резина
     */
    public Car(String brand, String model, double engine, String color, int year, String country, String gearBox,
               String bodyType, String registrationNumber, int numberSeats) {
        if (brand.isEmpty() || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty() || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engine <= 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
        if (color.isEmpty() || color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country.isEmpty() || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (gearBox.isEmpty() || gearBox == null) {
            this.gearBox = "default";
        } else {
            this.gearBox = gearBox;
        }
        if (bodyType.isEmpty() || bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber.isEmpty() || registrationNumber == null) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberSeats <= 0) {
            this.numberSeats = Math.abs(numberSeats);
        } else {
            this.numberSeats = numberSeats;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setEngine(double engine) {
        if (engine <= 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setGearBox(String gearBox) {
        if (gearBox.isEmpty() || gearBox == null) {
            this.gearBox = "default";
        } else {
            this.gearBox = gearBox;
        }
    }

    public void getChangeTires(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 4) {
            summerOrWinterTires = false;
        } else if (monthNumber > 4 && monthNumber < 10) {
            summerOrWinterTires = true;
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            summerOrWinterTires = false;
        }
        if (summerOrWinterTires) {
            System.out.println("Летняя резина");
        } else {
            System.out.println("Зимняя резина");
        }


    }
}
