public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Shane Hollandor", "862AOR");
        Driver d2 = new Driver("Ilya Rozanov", "280AOD");
        Vehicle car = new Car("Audi", 2025, d1, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Kawasaki", 2020, d2, false);
        Vehicle truck = new Truck("Volvo", 2018, d1, 12000.0, 4);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();

            Driver driver = v.getDriver();
                if (driver != null) {
                    driver.displayDriverInfo();
                }
                System.out.println("--");
            }
        }
    }
