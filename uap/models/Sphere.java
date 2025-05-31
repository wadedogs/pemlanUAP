package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PIRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere() {
        super();
        this.setName("Donat tanpa lubang");
        this.radius = 0;
    }

    public Sphere(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println(getName());
        System.out.println("=============================================");
        System.out.printf("Volume : %.2f\n", getVolume());
        System.out.printf("Luas permukaan : %.2f\n", getSurfaceArea());
        System.out.printf("Massa : %.2f\n", getMass());
        System.out.printf("Massa dalam kg : %.0f\n", gramToKilogram());
        System.out.printf("Biaya kirim : Rp%.0f\n", calculateCost());
        System.out.println("=============================================");
    }
}