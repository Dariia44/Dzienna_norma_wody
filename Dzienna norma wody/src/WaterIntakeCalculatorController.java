import interfaces.WaterIntakeCalculatorInterface;
import models.WaterIntakeCalculator;

import java.util.Scanner;

public class WaterIntakeCalculatorController {
    private WaterIntakeCalculatorInterface calculator;

    public void setCalculator(WaterIntakeCalculatorInterface calculator) {
        this.calculator = calculator;
    }

    public void readUserData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Waga: (w kg):");
        double weight = scanner.nextDouble();
        calculator.setWeight(weight);

        System.out.println("Płeć: (male/female):");
        String gender = scanner.next();
        calculator.setGender(gender);

        System.out.println("Poziom aktywności (low/medium/high):");
        String activityLevel = scanner.next();
        calculator.setActivityLevel(activityLevel);
    }
    public void calculateWaterIntake() {
        double waterIntake = calculator.calculateWaterIntake();
        System.out.println("Musisz spożywać okolo " + waterIntake + " litry wody");
    }

    public static void main(String[] args) {
        WaterIntakeCalculatorController controller = new WaterIntakeCalculatorController();
        WaterIntakeCalculator calculator = new WaterIntakeCalculator();
        controller.setCalculator(calculator);

        controller.readUserData();
        controller.calculateWaterIntake();
    }
}
