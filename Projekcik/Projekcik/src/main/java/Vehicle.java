public class Vehicle {
//    String make;
//    String model;
    int battery;
    double fuelAmount;
    double fuelCapacity;
    double fuelConsumption;
    int distanceTravelled;

    public Vehicle(int battery, double fuelAmount, double fuelCapacity, double fuelConsumption) {
//        this.make = make;
//        this.model = model;
        this.battery = battery;
        this.fuelAmount = fuelAmount;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.distanceTravelled = distanceTravelled;
    }

    public boolean turnOn(){
        if(this.fuelAmount > 10 && this.battery > 15) {
            return true;
        }
        return false;
    }

    public boolean refuel(double fuelAdded){

        if(fuelAdded <= 0) {
            return false;
        } else {
            this.fuelAmount+=fuelAdded;

            if(this.fuelAmount >= this.fuelCapacity) {
                this.fuelAmount = this.fuelCapacity;
                return true;
            }
        }
//        if(this.fuelAmount < 5 && this.fuelCapacity != 20) {
//            return true;
//        }
        return false;
    }

    public boolean drive(int kilometersTravelled){
        if(fuelAmount != 0 && turnOn()) {
            fuelAmount = fuelAmount - (kilometersTravelled * fuelConsumption);
            distanceTravelled += kilometersTravelled;
            return true;
        }
        return false;
    }

    public int getBattery() {
        return battery;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
    public double getFuelAmount() {
        return fuelAmount;
    }
    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
