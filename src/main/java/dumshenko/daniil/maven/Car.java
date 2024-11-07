package dumshenko.daniil.maven;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Scanner;

@Setter
@Getter
public class Car {
    private double fuelLevel;
    private double fuelConsumption;
    private LocalDate nextInspection;

    public Car(double fuelLevel, double fuelConsumption, LocalDate nextInspection) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.nextInspection = nextInspection;
    }

    public boolean canRide() {
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Type fuel amount: ");
//        fuelLevel = scanner.nextDouble();

        return (fuelLevel > 0);
    }

    public double calculateMaxDistance() {
        return (fuelLevel / fuelConsumption) * 100;
    }

    public boolean isAllowedToOperate() {
        LocalDate today = LocalDate.now();
        return !today.isAfter(nextInspection);
    }
}
