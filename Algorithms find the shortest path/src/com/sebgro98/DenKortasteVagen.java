package com.sebgro98;

public class DenKortasteVagen {
    // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
    // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
    // av den andra mellanstationen på index 2 i vektorn.

    public static int[] mellanstationer (double[] a, double[][] b, double[] c) {

        int[] stations = new int[3];

        double minLength = a[1] + b[1][1] + c[1];

        // loopar igenom alla olika fall för att jämföra och välja den kortaste utav dem
        // British Museum algorithm används med uppdateringsstrategi
        for (int i = 1; i < a.length; i++) {
            for(int j = 1; j < c.length; j++) {
                double currentLength = a[i] + b[i][j] + c[j];

                if (currentLength < minLength) {
                    minLength = currentLength;
                    stations[1] = i;
                    stations[2] = j;
                }

            }

        }

        return stations;

    }

    // langd returnerar längden av den kortaste vägen.
    public static double langd (double[] a, double[][] b, double[] c) {

        int[] shortestLength = mellanstationer(a, b , c);


        return a[shortestLength[1]] + b[shortestLength[1]][shortestLength[2]] + c[shortestLength[2]];
    }
}
