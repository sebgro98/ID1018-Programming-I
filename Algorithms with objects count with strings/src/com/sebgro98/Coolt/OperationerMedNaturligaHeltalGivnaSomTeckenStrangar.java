package com.sebgro98.Coolt;

import java.util.*; // scanner
import static java.lang.System.*;

public class OperationerMedNaturligaHeltalGivnaSomTeckenStrangar {

    public static void main(String[] args) {
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
        // mata in två naturliga heltal
        Scanner in = new Scanner (System.in);
        out.println ("två naturliga heltal:");
        String tal1 = in.next ();
        String tal2 = in.next ();
        out.println ();

        // addera heltalen och visa resultatet
        String summa = addera (tal1, tal2);
        visa (tal1, tal2, summa, '+');

        // subtrahera heltalen och visa resultaten

        String differens = subtrahera(tal1, tal2);
        visa(tal1, tal2, differens, '-');

    }

    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras
    // summa som en teckensträng.

    public static String addera (String tal1, String tal2)
    {
        StringBuilder summa = new StringBuilder();
        int carry = 0;

        // kontrollerar vilken som är längst
        if (tal1.length() > tal2.length())
            tal2 = sammaLangd(tal1, tal2);
        else if (tal2.length() > tal1.length())
            tal1 = sammaLangd(tal2, tal1);

            // addition genom att ta ett tal i taget och räkna bakifrån
            for (int i = tal1.length() - 1; i >= 0; i-- ) {
                int char1 = Character.getNumericValue(tal1.charAt(i)); // kontrollerar från index vad för siffra som
                int char2 = Character.getNumericValue(tal2.charAt(i)); // ligger där och sparar det värdet som en int
                int partSumma = char1 + char2 + carry;
                carry = partSumma / 10;
                partSumma = partSumma % 10;
                summa.append(partSumma); // lägger ihop siffrorna som plussas
            }
            // om carry = 1 efter loopen lägg till carry
        if (carry == 1) {
            summa.append(carry);
        }
        summa.reverse();
        return summa.toString();
    }

    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar
    // deras differens som en teckensträng.
    // Det första heltalet är inte mindre än det andra heltalet.

   public static String subtrahera (String tal1, String tal2)
   {
       StringBuilder diff = new StringBuilder();
       int carry = 0;

       // kontrollerar vilken som är längst
       if (tal1.length() > tal2.length())
           tal2 = sammaLangd(tal1, tal2);

       for (int i = tal1.length() - 1; i >= 0; i--) {
           int char1 = Character.getNumericValue(tal1.charAt(i)) - carry; // om vi har lånat ta minus 1
           int char2 = Character.getNumericValue(tal2.charAt(i));
           int partDiff;
           if (char1 >= char2) {
               partDiff = char1 - char2;
               carry = 0;
           }
           //om talet blir negativt så plussa 10 och ta minus på andra talet
           else {
               partDiff = (char1 + 10) - char2;
               carry = 1;
           }
           diff.append(partDiff);
       }
       diff.reverse();
       return diff.toString();
   }

    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation
    // utförd i samband med hetalen

    public static void visa (String tal1, String tal2, String resultat, char operator)
    {
        // sätt en lämplig längd på heltalen och resultatet
        int len1 = tal1.length ();
        int len2 = tal2.length ();
        int len = resultat.length ();
        int maxLen = Math.max (Math.max (len1, len2), len);
        tal1 = sattLen (tal1, maxLen - len1);

        tal2 = sattLen (tal2, maxLen - len2);
        resultat = sattLen (resultat, maxLen - len);
        // visa heltalen och resultatet
        out.println (" " + tal1);
        out.println ("" + operator + " " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print ("-");
        out.println ();
        out.println (" " + resultat + "\n");
    }

    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLen (String s, int antal)
    {
        StringBuilder sb = new StringBuilder (s);
        for (int i = 0; i < antal; i++)
            sb.insert (0, " ");
        return sb.toString ();
    }

    // lägger till nollor för att få båda strängarna lika långa
    public static String sammaLangd (String storst, String minst) {
        int diff = storst.length() - minst.length();
        StringBuilder sb = new StringBuilder(minst);
        for (int i = 0; i < diff; i++) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }
}
