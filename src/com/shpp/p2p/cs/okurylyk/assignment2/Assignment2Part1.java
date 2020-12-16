package com.shpp.p2p.cs.okurylyk.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    double x1, x2, a, b, c;

    public void run() {
        inputСoefficient();
        solveEquation();
    }

    /**
     * check if "a" equal to zero. If not, finding discriminant and check it to understand how many solutions there are
     * could be. If "a" equal zero print out Error!
     */
    private void solveEquation() {
        if (a == 0) {
            println("Error! `a` can`t be equal 0");
        } else {
            double d = Math.pow(b, 2) - (4 * a * c);
            if (d < 0) {
                println("There are no real roots!");
            } else if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / 2 * a;
                x2 = (-b - Math.sqrt(d)) / 2 * a;
                println("There are two roots: " + x1 + " and " + x2);
            } else if (d == 0) {
                x1 = (-b) / 2 * a;
                println("There is one root: " + x1);
            }
        }
    }

    // Just asking user to input coefficients
    private void inputСoefficient() {
        a = readDouble("Please enter a: ");
        b = readDouble("Please enter b: ");
        c = readDouble("Please enter c: ");
    }
}
