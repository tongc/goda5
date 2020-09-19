package com.goda5.hagendaz.common;

public class WaysToDecode {
    public static void main(String[] args) {
        System.out.println(new WaysToDecode().decode("1"));
        System.out.println(new WaysToDecode().decode("11"));
        System.out.println(new WaysToDecode().decode("77"));
        System.out.println(new WaysToDecode().decode("26"));
        System.out.println(new WaysToDecode().decode("123"));
        System.out.println(new WaysToDecode().decode("1234"));
        System.out.println(new WaysToDecode().decode("7777"));

        System.out.println(new WaysToDecode().decode2("1"));
        System.out.println(new WaysToDecode().decode2("11"));
        System.out.println(new WaysToDecode().decode2("77"));
        System.out.println(new WaysToDecode().decode2("26"));
        System.out.println(new WaysToDecode().decode2("123"));
        System.out.println(new WaysToDecode().decode2("1234"));
        System.out.println(new WaysToDecode().decode2("11111"));
        System.out.println(new WaysToDecode().decode2("7777"));
    }

    public int decode(String values) {
        if (values.length() == 0 || values.length() == 1) {
            return 1;
        }
        int first = Character.getNumericValue(values.charAt(0));
        int second = Character.getNumericValue(values.charAt(1));
        if (first <= 2 && second <= 6) {
            return decode(values.substring(1))
                    + decode(values.substring(2));
        } else {
            return decode(values.substring(1));
        }
    }

    public int decode2(String values) {
        if (values.length() == 0 || values.length() == 1) {
            return 1;
        }
        int first = Character.getNumericValue(values.charAt(0));
        int second = Character.getNumericValue(values.charAt(1));
        if (first <= 2 && second <= 6) {
            return decode2(values.substring(1)) + 2;
        } else {
            return decode2(values.substring(1)) + 1;
        }
    }
}
