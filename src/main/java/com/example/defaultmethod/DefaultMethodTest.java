package com.example.defaultmethod;

public interface DefaultMethodTest {
    default void print(String message) {
        System.out.println(message);
    }
}
