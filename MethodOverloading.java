package oop;

import java.util.Scanner;

public class MethodOverloading {

    void add(int a, int b) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer number : ");
        a = input.nextInt();

        System.out.print("Enter any Integer number : ");
        b = input.nextInt();

        int sum = a - b;
        System.out.println("Sub : " + sum);
    }

    void add(double a, double b) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        a = input.nextInt();

        System.out.print("Enter any number : ");
        b = input.nextInt();

        double result = a * b;
        System.out.println("Multiple : " + result);

    }

    void add(int a, int b, int c) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer number : ");
        a = input.nextInt();

        System.out.print("Enter any Integer number : ");
        b = input.nextInt();

        System.out.print("Enter any Integer number : ");
        c = input.nextInt();

        int result = a + b + c;
        System.out.println("Sum : " + result);

    }

    public static void main(String[] args) {

        MethodOverloading sum = new MethodOverloading();
        sum.add(0, 0);
        sum.add(0, 0, 0);
        sum.add(0.0, 0.0);

    }

}
