package edu.epam.zavadskaya.entity;

import edu.epam.zavadskaya.service.BasketService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BasketTest {

    Ball blackBall = new Ball(0.5, Color.BLACK);
    Ball whiteBall = new Ball(0.3, Color.WHITE);
    Ball blueBall = new Ball(0.4, Color.BLUE);
    Ball redBall = new Ball(0.1, Color.RED);
    Ball greenBall = new Ball(0.6, Color.GREEN);
    Ball yellowBall = new Ball(0.2, Color.YELLOW);

    Basket basket = new Basket();
    ArrayList<Ball> balls = basket.getBalls();

    @Test
    public void testGetColorCountAfterAdd() {
        int numberOfBlueBalls = BasketService.getColorCount(Color.BLUE, balls);
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        Assert.assertEquals(2, numberOfBlueBalls);
    }

    @Test
    public void testGetWeightAfterAdd() {
        double weight = BasketService.getWeight(balls);
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        Assert.assertEquals(1.5, weight);
    }

    @Test
    public void testGetColorCountAfterRemove() {
        int numberOfRedBalls = BasketService.getColorCount(Color.RED, balls);
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        basket.add(redBall);
        basket.remove(redBall);
        Assert.assertEquals(0, numberOfRedBalls);
    }

    @Test
    public void testGetWeightAfterRemove() {
        double weight = BasketService.getWeight(balls);
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        basket.add(redBall);
        basket.remove(redBall);
        Assert.assertEquals(1.5, weight);
    }
}