package edu.epam.zavadskaya.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasketTest {

    Ball blackBall = new Ball(0.5, Color.BLACK);
    Ball whiteBall = new Ball(0.3, Color.WHITE);
    Ball blueBall = new Ball(0.4, Color.BLUE);
    Ball redBall = new Ball(0.1, Color.RED);
    Ball greenBall = new Ball(0.6, Color.GREEN);
    Ball yellowBall = new Ball(0.2, Color.YELLOW);

    @Test
    public void testAdd() {
        Basket basket = new Basket();
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        Assert.assertEquals(2, basket.getColorCount(Color.BLUE));
        Assert.assertEquals(1.5, basket.getWeight());
    }

    @Test
    public void testRemove() {
        Basket basket = new Basket();
        basket.add(blackBall);
        basket.add(blueBall);
        basket.add(blueBall);
        basket.add(yellowBall);
        basket.add(redBall);
        basket.remove(redBall);
        Assert.assertEquals(0, basket.getColorCount(Color.RED));
        Assert.assertEquals(1.5, basket.getWeight());
    }

}