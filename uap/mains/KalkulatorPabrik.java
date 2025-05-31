package uap.mains;

import uap.models.Sphere;
import uap.models.Torus;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("OASE BIMASENA ILHAMAZIIZ");
        System.out.println("245150707111059");
        System.out.println("=============================================");
        
        // Input untuk Torus (Donat dengan lubang)
        System.out.print("Isikan Radius : ");
        double majorRadius = scanner.nextDouble();
        System.out.print("Isikan radius : ");
        double minorRadius = scanner.nextDouble();
        
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();
        
        // Input untuk Sphere (Donat tanpa lubang)
        System.out.print("Isikan radius : ");
        double radius = scanner.nextDouble();
        
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        
        scanner.close();
    }
}