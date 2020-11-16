package edu.epam.zavadskaya.controller;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Basket;
import edu.epam.zavadskaya.entity.Color;
import edu.epam.zavadskaya.view.Printer;

public class Main {
    public static void main(String[] args) {
        Ball blackBall = new Ball(0.5, Color.BLACK);
        Ball whiteBall = new Ball(0.3, Color.WHITE);
        Ball blueBall = new Ball(0.4, Color.BLUE);
        Ball redBall = new Ball(0.1, Color.RED);
        Ball greenBall = new Ball(0.6, Color.GREEN);
        Ball yellowBall = new Ball(0.2, Color.YELLOW);

        Basket basket = new Basket();
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);

        Printer.print("Number of blue balls: " + basket.getColorCount(Color.BLUE));
        Printer.print("\nTotal weight: " + basket.getWeight());
    }
}
