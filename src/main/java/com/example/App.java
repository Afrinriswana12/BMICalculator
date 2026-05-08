package com.example;

public class App {

    public double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {

        App app = new App();

        double BMI = app.calculateBmi(70, 1.75);

        System.out.println("BMI: " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal (Healthy)");
        }
        else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
