package dumshenko.daniil.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CarTest {

    private static Car car;

    @BeforeEach
    void setUpBeforeClass() {
        car = new Car(30, 15, LocalDate.of(2025, 5, 15));
    }

    @Test
    void shouldReturnTrueIfCanRide() {
        //when
        boolean b = car.canRide();
        //then
        Assertions.assertTrue(b);
    }

    @Test
    void shouldReturnMaxDistance() {
        //when
        double v = car.calculateMaxDistance();
        //then
        Assertions.assertEquals(200.0, v);
    }

    @Test
    void isAllowedToOperate() {
        //when
        boolean allowedToOperate = car.isAllowedToOperate();
        //then
        Assertions.assertTrue(allowedToOperate);
    }

    @Test
    void shouldReturnFuelLevel() {
        //when
        double fuelLevel = car.getFuelLevel();
        //then
        Assertions.assertEquals(30.0, fuelLevel);
    }

    @Test
    void shouldReturnFuelConsumption() {
        //when
        double fuelConsumption = car.getFuelConsumption();
        //then
        Assertions.assertEquals(15.0, fuelConsumption);
    }

    @Test
    void shouldReturnNextInspection() {
        //when
        LocalDate nextInspection = car.getNextInspection();
        //then
        Assertions.assertEquals(LocalDate.of(2025, 5, 15), nextInspection);
    }
}
