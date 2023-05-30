package interfaces;

public interface WaterIntakeCalculatorInterface {
    void setWeight(double weight);

    void setGender(String gender);

    void setActivityLevel(String activityLevel);

    double calculateWaterIntake();
}