package models;

import interfaces.WaterIntakeCalculatorInterface;

public abstract class AbstractWaterIntakeCalculator implements WaterIntakeCalculatorInterface {
    protected double weight;
    protected String gender;
    protected String activityLevel;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public String getActivityLevel() {
        return activityLevel;
    }
}
