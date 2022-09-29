package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGTH = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGTH*SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 5;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel () {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_HEIGTH, SCREEN_WIDTH));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdaptor());
        startGame();
    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
    }
    public void printComponent(Graphics g) {

    }
    public void draw(Graphics g) {

    }
    public void newApple() {

    }
    public void move() {

    }
    public void checkApple() {

    }
    public void checkCollisions() {

    }
    public void gameOver(Graphics g) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdaptor extends KeyAdapter {
        @Override
        public void keyPressed(keyEvent e) {

        }
    }
}
