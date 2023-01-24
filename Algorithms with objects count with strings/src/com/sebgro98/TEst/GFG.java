package com.sebgro98.TEst;

public class GFG {

    public static void main (String[] args) {

        String n1 = "0200";
        String n2 = "00140";

        System.out.println(isSmaller(n1,n2));

    }

    static boolean isSmaller(String str1, String str2)
    {
        // Calculate lengths of both string
        int n1 = str1.length(), n2 = str2.length();
        if (n1 < n2)
            return true;
        if (n2 < n1)
            return false;

        for (int i = 0; i < n1; i++)
            if (str1.charAt(i) < str2.charAt(i))
                return true;
            else if (str1.charAt(i) > str2.charAt(i))
                return false;

        return false;
    }

}
