package com.driver;

public class Main {



public  static class Product {


    public int Product(int x, int y) {
        return x*y;

    }
    public int Product(int x,int y,int z){
        return x*y*z;
        }

        public double Product(double x,double y){
        return x*y;
        }
}

public static void main(String [] args){
    Product p = new Product();

    p.Product(10,5);
    p.Product(10,5,2);
    p.Product(5.02,3.01);


}
}
