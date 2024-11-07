package dumshenko.daniil.maven;

import java.time.LocalDate;

/* public static void fox() {

    Fox fox = new Fox();

    fox.setName("Sister");
    fox.setAge(50);

    System.out.println(fox);

} */

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(150, 15, LocalDate.of(2025, 5, 15));

        System.out.println(car1.canRide());

        System.out.println("Max distance: " + car1.calculateMaxDistance() + "km");

        if (car1.isAllowedToOperate()) {
            System.out.println("Машина допущена до експлуатації.");
        } else {
            System.out.println("Машина не допущена до експлуатації.");
        }
    }
}
