package org.example;

import org.example.model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = Smartphone.builder()
                .brand("Apple")
                .model("15 Pro Max")
                .build();

        System.out.println(smartphone.call("658475125"));
        System.out.println(smartphone.takePhoto());
        System.out.println(smartphone.alarm());
    }
}