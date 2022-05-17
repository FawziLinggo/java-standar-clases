package com.fawzi.linggo.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Fawzi");
        builder.append(" ");
        builder.append("Linggo");
        builder.append(" ");
        builder.append("Yametter");

        String name = builder.toString();
        System.out.println(name);
    }
}
