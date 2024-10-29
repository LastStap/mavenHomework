package dumshenko.daniil.maven;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {
        Car car1 = new Car(5, 1, LocalDate.of(2024, 5, 15));
        car1.canRide();
        System.out.println("Max distance: " + car1.calculateMaxDistance() + "km");

        if (car1.isAllowedToOperate()){
            System.out.println("Машина допущена до експлуатації.");
        } else {
            System.out.println("Машина не допущена до експлуатації.");
        }
    }
}
