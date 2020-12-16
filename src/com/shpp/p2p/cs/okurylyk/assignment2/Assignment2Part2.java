package com.shpp.p2p.cs.okurylyk.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int DIAMETER = 100;

    public void run() {
        makeFourCircles();
        makeSquare();
    }

    // Drawing square
    private void makeSquare() {
        GRect k = new GRect(DIAMETER / 2.0, DIAMETER / 2.0,
                getWidth() - DIAMETER, getHeight() - DIAMETER);
        k.setFilled(true);
        k.setFillColor(Color.WHITE);
        k.setColor(Color.WHITE);
        add(k);
    }

    /**
     * Using two loops I can change with help of "i" and "j" variables to X and Y coordinates
     * in accordance. So I can draw 4 circles with don`t describing each circle but describe one
     * and use it 4 times changing their coordinates.
     */
    private void makeFourCircles() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                GOval circle = new GOval((getWidth() - DIAMETER) * i, (getHeight() - DIAMETER) * j,
                        DIAMETER, DIAMETER);
                circle.setColor(Color.BLACK);
                circle.setFilled(true);
                circle.setFillColor(Color.BLACK);
                add(circle);
            }
        }
    }
}
