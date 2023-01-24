package com.sebgro98.TEst;

public class Main {
    public static void main (String[] args) {
        int i = 4;
        int fig1;
        String num1 = "78";
        String num2 = "128482";
        if (num1.length() > num2.length()) {
            num2 = sammaLangd(num1, num2);
        } else if (num2.length() > num1.length()) {
            num1 = sammaLangd(num2, num1);
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(fig1 = Character.getNumericValue(num2.charAt(i)));


    }
    public static String sammaLangd (String storst, String minst) {
        int diff = storst.length() - minst.length();
        StringBuilder sb = new StringBuilder(minst);
        for (int i = 0; i < diff; i++) {
            sb.insert(0, "0");
        }
        minst = sb.toString();
        return minst;
    }
}
