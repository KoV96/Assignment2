package com.shpp.p2p.cs.okurylyk.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 1;
    private static final int NUM_COLS = 1;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    /* The Application width and height*/
    public static final int APPLICATION_WIDTH = NUM_COLS * 100;
    public static final int APPLICATION_HEIGHT = NUM_ROWS * 100;

    public void run() {
        drawBlackBoxMatrix(NUM_ROWS, NUM_COLS);
    }

    /**
     * Here I create the main method for solving the problem. This method will be drawing the matrix
     * which is consist from black boxes separated by white spaces.
     *
     * @param rows number of rows in our matrix (this param is const and input in the beginning of our program);
     * @param cols number of cols in our matrix (this param is const and input in the beginning of our program).
     */
    private void drawBlackBoxMatrix(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            drawOneRow(cols, i);
        }
    }

    /**
     * This method drawing only one raw of our matrix. And it must drawing such many times such many cols we have
     * already had.
     *
     * @param cols      number of cols in our matrix (this param is const and input in the beginning of our program)
     * @param rowNumber present number of row, which we takes from previous loop.
     */
    private void drawOneRow(int cols, int rowNumber) {
        for (int i = 0; i < cols; i++) {
            drawBlackBox(rowNumber, i);
        }
    }

    /**
     * What about this method, it drawing only one black box with spaces and return this to the upper method.
     * Also it takes into account dislocation of this box in our window and move it to the center position in
     * window.
     *
     * @param rowNumber present number of row;
     * @param colNumber present number of col, which takes from previous loop;
     */
    private void drawBlackBox(int rowNumber, int colNumber) {
        double x = BOX_SPACING + ((colNumber * BOX_SIZE) + (colNumber * BOX_SPACING));
        double y = BOX_SPACING + ((rowNumber * BOX_SIZE) + (rowNumber * BOX_SPACING));
        GRect blackBox = new GRect(((getWidth() / 2.0) - ((BOX_SIZE + BOX_SPACING) * NUM_COLS) / 2.0) + x,
                ((getHeight() / 2.0) - ((BOX_SIZE + BOX_SPACING) * NUM_ROWS) / 2.0) + y,
                BOX_SIZE, BOX_SIZE);
        fillObj(blackBox, Color.BLACK, true);
        add(blackBox);
    }

    // Give color to each object.
    private void fillObj(GFillable obj, Color fillColor, boolean isFilled) {
        obj.setFilled(isFilled);
        obj.setFillColor(fillColor);
    }
}
