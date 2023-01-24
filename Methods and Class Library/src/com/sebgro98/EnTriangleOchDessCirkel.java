package com.sebgro98;
import java.util.*;

public class EnTriangleOchDessCirkel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You will now get to calculate the inscribed and circumscribed circle within the triangle");
        System.out.println("Please choose three sides");

        System.out.print("\nHow long should the first side be: ");
        double side1 = in.nextDouble();

        System.out.print("\nHow long should the second side be: ");
        double side2 = in.nextDouble();

        System.out.print("\nHow long should the third side be: ");
        double side3 = in.nextDouble();

        System.out.println("\nRadian for the inscribed circle will be: " + Formler.inscribedCricle(side1, side2, side3 ));
        System.out.println("Radian for the circumscribed circle will be: " + Formler.circumscribedCircle(side1, side2, side3));

        in.close();
    }
}
