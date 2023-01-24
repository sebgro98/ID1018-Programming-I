package com.sebgro98;

import java.util.*;

public class Temperaturer {

    public static void main(String[] args)
    {
        System.out.println("TEMPERATURER\n");

        //inmatningsverktyg
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        // mata in uppgifter om antalet veckor och antalet mätningar
        System.out.print("antalet veckor: ");
        int antalVeckor = in.nextInt();
        System.out.print("antalet mätningar per vecka: ");
        int antalMatningarPerVecka = in.nextInt();

        // plats att lagra temperaturer
        double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];

        // mata in temperaturerna
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            System.out.println("temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                t[vecka][matning] = in.nextDouble();
        }

        System.out.println();

        //visa temperaturerna
        System.out.println("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
            {
                System.out.println(t[vecka][matning]+ " ");
            }

            System.out.println();
        }
        System.out.println();

        // den minsta, den största och medeltemperaturer - veckovis
        double[]  minT = new double[antalVeckor +1];
        double[]  maxT = new double[antalVeckor +1];
        double[] sumT = new double[antalVeckor + 1];
        double[] medelT = new double[antalVeckor + 1];

        // koden skrivs här

        for (int vecka = 1; vecka <= antalVeckor; vecka++ )
        {
            minT[vecka] = t[vecka][1]; // här lagras arrayens första mätning för att sedan fortsätta
            maxT[vecka] = t[vecka][1];
            sumT[vecka] = t[vecka][0]; // är tom i början

            for (int matningar = 1; matningar <= antalMatningarPerVecka; matningar++)
            {
                if (minT[vecka] > t[vecka][matningar]) // kontrollerar varje mätning per vecka om det är mindre eller inte och lagrar här
                    minT[vecka] = t[vecka][matningar];

                if (maxT[vecka] < t[vecka][matningar])
                    maxT[vecka] = t[vecka][matningar];

                sumT[vecka] += t[vecka][matningar]; // summan plussas för varje mätning på den veckan
                medelT[vecka] = sumT[vecka]/matningar;
            }

        }

        // visa den minsta, den största och medeltemperaturen för varje vecka
        // koden skirvs här
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {

            System.out.println("\nFör vecka " + vecka + " " + "gäller: ");
            System.out.println("Minsta teperaturen var: " + minT[vecka]);
            System.out.println("Största temperaturen var: " + maxT[vecka]);
            System.out.println("Medeltemperaturen var: " + medelT[vecka]);
            System.out.println("Summan var: " + sumT[vecka]);
        }

        // den minsta, den största och medeltemperaturen - hela mätperioden
        double minTemp = minT[1];
        double maxTemp = maxT[1];
        double sumTemp = sumT[1];
        double medelTemp = 0;

        //koden ska skrivas här
        for (int vecka = 2; vecka <= antalVeckor; vecka++ )
        {

            if (minTemp > minT[vecka]) // kontrollerar alla veckor och jämför om det värdet som finns på minT är större eller mindre
                minTemp = minT[vecka];


            if (maxTemp < maxT[vecka])
                maxTemp = maxT[vecka];

            //if (vecka > 1)
            sumTemp += sumT[vecka];

            //if (vecka == antalVeckor)
            //medelTemp = sumTemp/(antalVeckor*antalMatningarPerVecka);

        }
        medelTemp = sumTemp/(antalVeckor * antalMatningarPerVecka);
        // visa den minsta, den största och medeltemperatuern i hela mätperioden
        // koden ska skrivas här
        System.out.println("\nTemperaturerna under hela mätperioden är:");
        System.out.println("Minsta teperaturen var: " + minTemp);
        System.out.println("Största temperaturen var: " + maxTemp);
        System.out.println("Medeltemperaturen var: " + medelTemp);
        System.out.println("Summan för hela perioden var: " + sumTemp);

        in.close();
    }

}
