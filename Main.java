/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package francisbcastillolab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Select number for corresponding problem:"
                + " \n 0 for Area of Circle \n 1"
                + " for Area of Rectangle \n 2 for Area of Triangle"
                + " \n 3 for Volume of Sphere \n 4 for Volume of Cylinder "
                + "\n 5 for Calculating Third Side of Triangle (Law of Cosines)"
                + "\n 6 for Calculating Area of Circle Segment"
                + "\n 7 for Calculating Volume of Sphere"
                + "\n 8 for Calculating Surface Area of Sphere");

        int choice = input.nextInt();

        switch (choice) {
            case 0:
                AreaCircle(input);
                break;
            case 1:
                AreaRectangle(input);
                break;
            case 2:
                AreaTriangle(input);
                break;
            case 3:
                VolumeSphere(input);
                break;
            case 4:
                VolumeCylinder(input);
                break;
            case 5:
                TriSide(input);
                break;
            case 6:
                CircleSegmentArea(input);
                break;
            case 7:
                SphereVolume(input);
                break;
            case 8:
                SphereSurfaceArea(input);
                break;
            default:
                System.out.println("Invalid option");
        }

        input.close();
    }

    public static void AreaCircle(Scanner input) {
        System.out.println("Input radius of the circle:");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public static void AreaRectangle(Scanner input) {
        System.out.println("Input the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Input the width of the rectangle:");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void AreaTriangle(Scanner input) {
        System.out.println("Input the base of the triangle:");
        double base = input.nextDouble();
        System.out.println("Input the height of the triangle:");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void VolumeSphere(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double vol = (4.0 / 3.0) * Math.PI * Power(radius, 3);
        System.out.println("The volume of the sphere is: " + vol);
    }

    public static void VolumeCylinder(Scanner input) {
        System.out.println("Input the radius of the cylinder:");
        double radius = input.nextDouble();
        System.out.println("Input the height of the cylinder:");
        double height = input.nextDouble();
        double volume = Math.PI * Power(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }

    public static void TriSide(Scanner input) {
        System.out.println("Input side a of the triangle:");
        double a = input.nextDouble();
        System.out.println("Input side b of the triangle:");
        double b = input.nextDouble();
        System.out.println("Input the angle between side a and side b in degrees:");
        double angleC = input.nextDouble();

        double angleCRadians = Math.toRadians(angleC);
        double c = Math.sqrt(Power(a, 2) + Power(b, 2) - 2 * a * b * Math.cos(angleCRadians));

        System.out.println("The third side of the triangle is: " + c);
    }

    public static void CircleSegmentArea(Scanner input) {
        System.out.println("Input radius of the circle:");
        double radius = input.nextDouble();
        System.out.println("Input the central angle in degrees:");
        double theta = input.nextDouble();

        double thetaRadians = Math.toRadians(theta);
        double area = (Power(radius, 2) / 2) * (thetaRadians - Math.sin(thetaRadians));

        System.out.println("The area of the circle segment is: " + area);
    }

    public static void SphereVolume(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Power(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }

    public static void SphereSurfaceArea(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double surfaceArea = 4 * Math.PI * Power(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }


    public static double Power(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
}
}
    


