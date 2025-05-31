package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        super();
        this.setName("Donat dengan lubang");
        this.majorRadius = 0;
        this.minorRadius = 0;
    }

    public Torus(double majorRadius, double minorRadius) {
        this();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (PI * minorRadius * minorRadius) * (2 * PI * majorRadius);
    }

    @Override
    public double getSurfaceArea() {
        return (2 * PI * minorRadius) * (2 * PI * majorRadius);
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