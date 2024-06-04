public abstract class Airplane extends Vehicle {
    private double maxLoad;

    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public abstract double calcFuelEfficiency();
    
    
    public abstract double calcTripDistance();

  
    public abstract String toString();
}
