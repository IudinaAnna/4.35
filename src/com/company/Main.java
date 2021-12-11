package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        double a = input.nextDouble();
        System.out.println("Введите сторону b: ");
        double b = input.nextDouble();
        System.out.println("Введите сторону c: ");
        double c = input.nextDouble();
        if (a + b > c || a + c > b || b + c > a)
            System.out.println("Треугольник может быть построен ");
        else
            System.out.println("Треугольник не может быть построен ");
    }
}
