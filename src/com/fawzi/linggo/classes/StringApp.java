package com.fawzi.linggo.classes;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String name = "Fawzi Linggo";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();


        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Fawzi"));
        System.out.println(name.endsWith("Linggo"));

        String[] names = name.split(" ");
        for (var values : names){
            System.out.println(values);
        }

        System.out.println(name.isBlank());
        System.out.println("".isEmpty());

        System.out.println(name.charAt(3));
        char[] chars = name.toCharArray();
        for (var huruf : chars){
            System.out.println(huruf);
        }
    }
}
