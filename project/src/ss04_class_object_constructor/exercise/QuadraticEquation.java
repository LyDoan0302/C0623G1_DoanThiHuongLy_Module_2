package ss04_class_object_constructor.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) throws Exception {
        if (a != 0) {
            this.a = a;
        } else {
            throw new Exception("a is invalid");
        }
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws Exception {
        if (a != 0) {
            this.a = a;
        } else {
            throw new Exception("a is invalid");
        }

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
        return r2;
    }

    public String display() {
        return "quadratic equation: " + this.a + " * x2 " + " + " + this.b + " * x" + " + " + this.c + " = 0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = null;
        try {
            quadraticEquation = new QuadraticEquation(a, b, c);
            double delta = quadraticEquation.getDiscriminant();

            if (delta < 0) {
                System.out.println("The equation has no root.");
            } else if (delta == 0) {
                double r1 = quadraticEquation.getRoot1();
                System.out.println("The equation has one root: " + r1);
            } else {
                double r1 = quadraticEquation.getRoot1();
                double r2 = quadraticEquation.getRoot2();
                System.out.println("The equation has two root: " + "r1: " + r1 + ", r2: " + r2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(quadraticEquation);
    }
}