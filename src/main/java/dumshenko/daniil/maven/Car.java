package dumshenko.daniil.maven;

import java.time.LocalDate;
import java.util.Scanner;

public class Car {
    private double fuelLevel;
    private double fuelConsumption;
    private LocalDate nextInspection;

    public void canRide(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type fuel amount: ");
        fuelLevel = scanner.nextDouble();

        if (fuelLevel > 0){
            System.out.println("Car can ride");
        }
    }

    public double calculateMaxDistance(){
        return (fuelLevel / fuelConsumption) * 100;
    }

    public boolean isAllowedToOperate(){
        LocalDate today = LocalDate.now();
        return !today.isAfter(nextInspection);
    }

    public Car(double fuelLevel, double fuelConsumption, LocalDate nextInspection) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.nextInspection = nextInspection;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LocalDate getNextInspection() {
        return nextInspection;
    }

    public void setNextInspection(LocalDate nextInspection) {
        this.nextInspection = nextInspection;
    }


}
