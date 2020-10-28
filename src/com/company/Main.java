package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 28;
        short sh = 128;
        int i = 1280;
        long l = 12800000000L;
        float f = 28.30f;
        double d = 360.80d;
        char ch_first = 'a';
        char ch_second = '\u0021';
        boolean bool = true;
        String name = "Ani";

        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch_first);
        System.out.println("char: " + ch_second);
        System.out.println("boolean: " + bool);
        System.out.println("name:  " + name + ch_second);
    }
}
