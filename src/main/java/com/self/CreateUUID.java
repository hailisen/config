package com.self;

import java.util.UUID;

public class CreateUUID {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }
}
