package edu.epam.zavadskaya.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayServiceTest {

    @Test
    public void testBubbleSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = ArrayService.bubbleSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = ArrayService.insertionSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShellSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = ArrayService.shellSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() {
        int[] array = {2, 5, 1, 3, 4};
        int expected = ArrayService.findMax(array);
        int actual = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        int[] array = {2, 5, 1, 3, 4};
        int expected = ArrayService.findMin(array);
        int actual = 1;
        Assert.assertEquals(actual, expected);
    }
}