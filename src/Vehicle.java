public  abstract class Vehicle {
    protected String brand;
    protected int year;
    private Driver driver;
    public Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }
    public void setDriver(Driver driver) {
        if (driver != null) {
            this.driver = driver;
        }
    }
    public Driver getDriver() {
        return driver;
    }
    public void displayInfo() {
        System.out.println("Vehicle brand: " + brand + ", year: " + year);
    }
    public abstract void startEngine();
    public abstract void stopEngine();
}
