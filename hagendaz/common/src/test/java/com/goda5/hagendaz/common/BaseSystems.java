package com.goda5.hagendaz.common;

public class BaseSystems {
    public static void main(String[] args) {
        System.out.println(new BaseSystems().base3());
        System.out.println(new BaseSystems().base16());
        System.out.println(new BaseSystems().base64());
    }

    public String base64() {
        char[] baseSystem = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
        int input = 262143;
        String result = "";
        while(input > 0) {
            result += baseSystem[input % 64];
            input /= 64;
        }
        return result;
    }

    public String base16() {
        char[] baseSystem = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int input = 255;
        String result = "";
        while(input > 0) {
            result += baseSystem[input % 16];
            input /= 16;
        }
        return result;
    }

    public String base3() {
        char[] baseSystem = new char[]{'a','b','c'};
        int input = 2186;
        String result = "";
        while(input > 0) {
            result += baseSystem[input % 3];
            input /= 3;
        }
        return result;
    }
}
