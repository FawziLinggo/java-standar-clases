package com.fawzi.linggo.classes;

import java.util.StringJoiner;

public class StringJoinnerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("Gotol");
        joiner.add("pedeh");
        joiner.add("ko");
        joiner.add("wen");

        joiner.toString();
        System.out.println(joiner.toString());

    }

}
