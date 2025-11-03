package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.product(5,4));
        System.out.println(p1.product(5,4,7));
        System.out.println(p1.product(5.2,4.5));
    }
}