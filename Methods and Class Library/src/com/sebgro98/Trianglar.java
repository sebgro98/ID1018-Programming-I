package com.sebgro98;
import java.util.*;

public class Trianglar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\nDo you wish to calculate a triangles area press 1");
        System.out.println("Do you wish to calculate a triangles circumference press 2");
        System.out.println("Do you wish to calculate the triangles bisektris press 3");

        int menu = in.nextInt();

        switch(menu){
            case 1:
                System.out.print("\nChoose the triangles base: ");
                double base = in.nextDouble();
                System.out.print("\nChoose the triangles height: ");
                double height = in.nextDouble();
                System.out.println("\nThe triangles area is: " + Formler.triangleArea(base, height));
                break;

            case 2:
                System.out.println("Choose three sides for the triangle");
                System.out.print("\nSide 1: ");
                double side1 = in.nextDouble();
                System.out.print("\nSide 2: ");
                double side2 = in.nextDouble();
                System.out.print("\nSide 3: ");
                double side3 = in.nextDouble();
                System.out.println("\nThe triangles circumference is: " +
                        Formler.triangleCircumeference(side1, side2, side3));
                break;

            case 3:
                System.out.println("\nChoose all the angles in radian, and then all the sides of the triangle");
                System.out.print("\nfirst angle for the triangle: ");
                double alfa = in.nextDouble();
                System.out.print("\nSecond angle for the triangle: ");
                double beta = in.nextDouble();
                System.out.print("\nThird angle for the triangle: ");
                double delta  = in.nextDouble();
                System.out.print("\nChoose the first side of the triangle: ");
                double a = in.nextDouble();
                System.out.print("\nChoose the second side of triangle: ");
                double b = in.nextDouble();
                System.out.print("\nChoose the third side of the triangle: ");
                double c = in.nextDouble();
                System.out.print("The triangles bis are: " + Formler.bisektrisAlfa(a, b, alfa) + ", " +
                        Formler.bisektrisAlfa(b, c, beta) + ", " + Formler.bisektrisAlfa(c, a, delta));
                break;

            default:

                System.out.print("Something went wrong, do you wish to try again? press y to continue or any other key to quit: ");
                char question = in.next().charAt(0);

                if(Character.toLowerCase(question) == 'y')
                    main(args);
                else
                    break;

        }

        in.close();

    }

}
