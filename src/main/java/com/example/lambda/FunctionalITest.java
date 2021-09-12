package com.example.lambda;

/**
 * Interfaces funcionais podem ter:
 * apenas um metodo abstrato;
 * metodos padrão;
 * metodos estáticos;
 */
public interface FunctionalITest {
    void print(String message);
    default void printAll() {
        this.print("All");
    }
    static void sayHello() {
        System.out.println("Hello world!");
    }
}
