package com.company;

public class Main {

    public static void main(String[] args) {
        int s1 = 99, s2 = 99;
        float f1, f2;
        short b = -10;
        boolean q = true;

        s1 = (int)Math.pow(b, 2);
        s2 = (int)(Math.random() * 10);
        f2 = (float)(Math.random() * 9998 + 1);
        f1 = (float)(f2 / (s1 * s2));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(f2);
        System.out.println(f1);
        double y = (double)(Math.pow(Math.tan(f1), s2) / Math.log(s1));
        System.out.println(y);
    }
}
