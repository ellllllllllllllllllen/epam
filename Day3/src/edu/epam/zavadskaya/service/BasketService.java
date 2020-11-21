package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Color;

import java.util.ArrayList;

public class BasketService {

    public static int getColorCount(Color color, ArrayList<Ball> balls) {
        int numOfBalls = 0;
        for (Ball ball: balls) {
            if (ball.getColor() == color) {
                numOfBalls++;
            }
        }
        return numOfBalls;
    }

    public static double getWeight(ArrayList<Ball> balls){
        double weight = 0;
        for (Ball ball: balls){
            weight += ball.getWeight();
        }
        return weight;
    }
}
