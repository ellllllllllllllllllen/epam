package edu.epam.zavadskaya.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;
    private double weight;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public double getWeight() {
        return weight;
    }

    public void add(Ball ball)
    {
        if (ball == null)
            throw new NullPointerException();
        this.balls.add(ball);
        this.weight += ball.getWeight();
    }

    public void remove(Ball ball){
        balls.remove(ball);
        this.weight -= ball.getWeight();
    }

    public int getColorCount(Color color)
    {
        int numOfBalls = 0;
        for (Ball ball: balls)
        {
            if (ball.getColor() == color)
                numOfBalls++;
        }
        return numOfBalls;
    }
}
