package org.example;


public class Calcolatrice {

    public Double Somma(Double x, Double y){
        return x+y;
    }

    public static void main(String[] args) {
        Calcolatrice c = new Calcolatrice();

        System.out.println(c.Somma(5.0, 10.0));
        System.out.println("b");
    }
}

