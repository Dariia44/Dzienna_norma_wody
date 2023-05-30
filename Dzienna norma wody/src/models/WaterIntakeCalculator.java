package models;


public class WaterIntakeCalculator extends AbstractWaterIntakeCalculator {
    @Override
    public double calculateWaterIntake() {
        double waterIntake = 0.0;


        switch (gender) {
            case "male":
                if (activityLevel.equals("low")) {
                    waterIntake = weight * 0.035;
                } else if (activityLevel.equals("medium")) {
                    waterIntake = weight * 0.042;
                } else if (activityLevel.equals("high")) {
                    waterIntake = weight * 0.071;
                }
                break;
            case "female":
                if (activityLevel.equals("low")) {
                    waterIntake = weight * 0.03;
                } else if (activityLevel.equals("medium")) {
                    waterIntake = weight * 0.039;
                } else if (activityLevel.equals("high")) {
                    waterIntake = weight * 0.67;
                }
                break;
        }

        return waterIntake;
    }
}
