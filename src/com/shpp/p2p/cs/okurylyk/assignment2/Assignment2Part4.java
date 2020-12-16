package com.shpp.p2p.cs.okurylyk.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


public class Assignment2Part4 extends WindowProgram {

    // Size of FLAG.
    private static final int FLAG_WIDTH = 600;
    private static final int FLAG_HEIGHT = 400;

    //Application size.
    public static final int APPLICATION_WIDTH = (int) (FLAG_WIDTH * 1.5);
    public static final int APPLICATION_HEIGHT = (int) (FLAG_HEIGHT * 1.5);

    // The number of colors in flag.
    private static final double NUMBER_OF_COLORS = 3.0;

    // Here I create new color Gold, for my Germany Flag.
    private static final Color GOLD = new Color(255, 233, 0);

    public void run() {
        drawFlagOfGermany(FLAG_WIDTH, FLAG_HEIGHT);
        add(makeLabelInLowerRightCorner(getWidth(), getHeight()));

    }

    /**
     * In this method I describing Label that will make flag name. I have decided to tie this
     * label to lower right corner of application window. For this I used such functions as label.getWidth
     * and label.getAscent.
     *
     * @param x this param takes an Application width;
     * @param y this param takes an Application height;
     * @return created label flagName.
     */
    private GLabel makeLabelInLowerRightCorner(int x, int y) {
        GLabel flagName = new GLabel("Flag of Germany");
        flagName.setFont(new Font("MV Boli",
                Font.PLAIN,
                (APPLICATION_WIDTH > 500 ? 30 : 20))); // make a condition for font size.
        flagName.setVisible(true);
        flagName.setColor(Color.BLACK);
        flagName.setLocation((x - flagName.getWidth()), (y - flagName.getAscent() / 2));
        return flagName;
    }

    /**
     * Here is the method that drawing my flag, as you understand I have chosen a Germany flag.
     * It consist from three parts, each of them drawing a part of one color.
     *
     * @param x this param takes a FlagWidth;
     * @param y this param takes a FlagHeight.
     */
    private void drawFlagOfGermany(int x, int y) {
        add(drawBlackPart(x, y));
        add(drawRedPart(x, y));
        add(drawGoldPart(x, y));
    }

    /**
     * I have centered this using getWidth getHeight and also const FlagWidth and FlagHeight.
     *
     * @param x this param takes a FlagWidth;
     * @param y this param takes a FlagHeight;
     * @return black part of flag.
     */
    private GRect drawBlackPart(int x, int y) {
        GRect black = new GRect((getWidth() / 2.0 - x / 2.0),
                (getHeight() / 2.0 - y / 2.0),
                x, y / NUMBER_OF_COLORS);
        black.setFilled(true);
        black.setColor(Color.BLACK);
        black.setFillColor(Color.BLACK);
        return (black);
    }

    /**
     * I have centered this using getWidth getHeight and also const FlagWidth and FlagHeight.
     *
     * @param x this param takes a FlagWidth;
     * @param y this param takes a FlagHeight;
     * @return red part of flag.
     */
    private GRect drawRedPart(int x, int y) {
        GRect red = new GRect((getWidth() / 2.0 - x / 2.0),
                ((getHeight() / 2.0) - y / (2 * NUMBER_OF_COLORS)),
                x, y / NUMBER_OF_COLORS);
        red.setFilled(true);
        red.setColor(Color.RED);
        red.setFillColor(Color.RED);
        return (red);
    }

    /**
     * -//-
     *
     * @param x this param takes a FlagWidth;
     * @param y this param takes a FlagHeight;
     * @return gold part of flag.
     */
    private GRect drawGoldPart(int x, int y) {
        GRect gold = new GRect((getWidth() / 2.0 - x / 2.0),
                ((getHeight() / 2.0) + y / (2 * NUMBER_OF_COLORS)),
                x, y / NUMBER_OF_COLORS);
        gold.setFilled(true);
        gold.setColor(GOLD);
        gold.setFillColor(GOLD);
        return (gold);
    }
}