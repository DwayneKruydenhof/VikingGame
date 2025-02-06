package com.main;

import com.inputs.KeyboardInputs;
import com.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    //Block movement
    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    //Paint component
    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 200, 50);

    }

}
