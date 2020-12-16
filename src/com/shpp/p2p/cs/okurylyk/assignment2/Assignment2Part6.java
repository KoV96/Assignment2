package com.shpp.p2p.cs.okurylyk.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {

    // The width and height of the oval.
    private static final int WIDTH_OF_SEGMENT = 100;
    private static final int HEIGHT_OF_SEGMENT = 100;

    // Total number of caterpillar segments.
    private static final int NUMBER_OF_SEGMENTS = 9;

    // Application width and height which is depend of upper const.
    public static final int APPLICATION_WIDTH = (NUMBER_OF_SEGMENTS * WIDTH_OF_SEGMENT);
    public static final int APPLICATION_HEIGHT = (2 * HEIGHT_OF_SEGMENT);

    // I have decided to create a gold caterpillar, so it needs to create this color.
    private static final Color GOLD = new Color(255, 233, 0);


    public void run() {
        drawCaterpillar();
    }

    // The main method, which draws caterpillar.
    private void drawCaterpillar() {
        for (int i = 0; i < NUMBER_OF_SEGMENTS; i++) {
            add(drawOneSeg(i));
        }
    }

    /**
     * This method drawing one segment of our caterpillar (for us this is an oval). The X and Y coordinates
     * will change by the loop that I have described in main method. Also this segments will have a coordinates
     * for X from 0...n and for Y from 0 to H (height of segment) then from H to 0 and again and again.
     * Knowing this I create conditions when Y coordinate of each segment will born. Also in this method I
     * take a color to the frame of segment.
     *
     * @param i The current number of a segment starting from 0 of course;
     * @return GOval.
     */
    private GOval drawOneSeg(int i) {
        GOval caterpillarSeg = new GOval((i * (((WIDTH_OF_SEGMENT / 2) + 10))),
                (i == 0 ? (HEIGHT_OF_SEGMENT / 2) : i % 2 == 0 ? (HEIGHT_OF_SEGMENT / 2) : 0), // here a condition
                WIDTH_OF_SEGMENT, HEIGHT_OF_SEGMENT);
        caterpillarSeg.setColor(Color.BLACK);
        fillObj(caterpillarSeg, GOLD, true);
        return caterpillarSeg;
    }

    // Give color to each object.
    private void fillObj(GFillable obj, Color fillColor, boolean isFilled) {
        obj.setFilled(isFilled);
        obj.setFillColor(fillColor);
    }
}
