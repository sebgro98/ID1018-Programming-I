package com.sebgro98;
import java.util.*;
public class BestamDenKortasteVagen
{
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of stations for Zone 2: ");
        int stationsZ2 = in.nextInt();
        System.out.print("Please enter the number of stations for Zone 3: ");
        int stationsZ3 = in.nextInt();

        // Skapar tre arrays där stationernas längder kommer att sparas

        double[] a = new double[stationsZ2 + 1];
        double[][] b = new double[stationsZ2 + 1][stationsZ3 + 1];
        double[] c = new double[stationsZ3 + 1];

        // Låter användaren skriva in längderna på stationerna
        System.out.println("\nEnter the distances between the following stations");
        for (int i = 1; i <= stationsZ2; i++ ) {
            System.out.print("x -> U" + i + ": ");
            a[i] = in.nextDouble();
        }

        for(int i = 1; i <= stationsZ2; i++) {

            for(int j = 1; j <= stationsZ3; j++) {
                System.out.print("U" + i + "-> V" + j + ": " );
                b[i][j] = in.nextDouble();
            }
        }

        for(int j = 1; j <= stationsZ3; j++) {
            System.out.print("V" + j + "-> Y: " );
            c[j] = in.nextDouble();
        }

        // Skriver ut den kortaste vägen genom att kalla på metoden mellansationerna från klassen DenKortasteVagnen
        int[] path = DenKortasteVagen.mellanstationer(a, b, c);
        System.out.println("\nThe shortest path is: x -> U" + path[1] + " -> V" + path[2] + " -> Y");
        //System.out.println(Arrays.toString(path));

        // Skriver ut längden på den kortaste vägen genom att kalla på metoden langd från klassen DenKortasteVagen
        double shortestLength = DenKortasteVagen.langd(a, b, c);
        System.out.println("The length of the shortest path is: " + shortestLength);

        in.close();

    }
}
