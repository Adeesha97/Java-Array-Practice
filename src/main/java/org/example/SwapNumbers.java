package org.example;

public class SwapNumbers {
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping values are : " + a + " , " + b);

        //Using third variable
         int c = a;
         a = b;
         b = c;

        System.out.println("After Swapping values in method 1 : " + a + " , " + b);


    }
}



