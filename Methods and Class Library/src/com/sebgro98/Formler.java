package com.sebgro98;

public class Formler
{
    public static double triangleArea (double base, double height) {
        return ((base * height)/2);

    }

    public static double triangleCircumeference (double side1, double side2, double side3) {
        return (side1 + side2 + side3);
    }

    public static double bisektrisAlfa (double b, double c, double alfa) {
        double p = 2 * b * c * Math.cos (alfa / 2);
        double bis = p / (b + c);
        return bis;
    }

    public static double inscribedCricle ( double a, double b, double c ) {

        double s = (0.5 * (a + b + c));
        double radianInscribed = Math.sqrt(((s - a) * (s - b) * (s - c)) / s);

        return radianInscribed;
    }

    public static double circumscribedCircle (double a, double b, double c ) {

        double s = (0.5 * (a + b + c));
        double radianCircumscribed = (a * b * c)/ (4 * Math.sqrt(s * (s - a) * (s - b)
                * (s - c) ) ) ;

        return radianCircumscribed;
    }

}

