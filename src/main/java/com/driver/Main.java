package com.driver;

public class Main {

    public  static class Product {

        public int product(int x,int y){
            return x*y;
        }

        public int product(int x,int y,int z){
            return x*y*z;
        }

        public double product(double x,double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.product(5,4));
        System.out.println(p1.product(5,4,7));
        System.out.println(p1.product(5.2,4.5));
    }
}