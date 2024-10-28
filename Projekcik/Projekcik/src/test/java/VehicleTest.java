import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void VehicleTurnsOnWhenItHasBatteryAndFuel(){
        Vehicle vehicle = new Vehicle(30, 20, 50, 0.8);

        boolean result = vehicle.turnOn();

        assertTrue(result);
    }

    public void VehicleTurnOnWhenItHasBattery() {
        Vehicle vehicle = new Vehicle(60, 20, 50, 0.8);

        boolean result = vehicle.turnOn();

        assertFalse(result);
    }

    public boolean refuel() {
        Vehicle vehicle = new Vehicle(20, 20, 50, 0.8);

        boolean result = refuel();

        return result;
    }
}