package nuordertest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.nuorder.FlyingCost;

/**
 * This class is in charge of run the test for the class FlyingCost
 * 
 * @author gndelossantos
 *
 */
public class FlyingCostTest {

	/**
	 * Test method to test that the static getMinimumCost method get the 
	 * minimum cost from a array
	 * 
	 */
    @Test
    public void testGetTheMinimum() {
    	int[][] peoplesG2 = {{20,50},{60,400},{200,100},{60,40},{60,40},{200,100}};

        int result = FlyingCost.getMinimumCost(peoplesG2);

        assertEquals(360, result);

    }
    
    /**
	 * Test method to test that the static getMinimumCost return 0 
	 * if the array is null
	 * 
	 */
    @Test
    public void testGetTheMinimumReturn0() {
    	int[][] peoplesG2 = null;

        int result = FlyingCost.getMinimumCost(peoplesG2);

        assertEquals(0, result);

    }
    
    /**
	 * Test method to test that the static getMinimumCost return 0 
	 * if the array is empty.
	 * 
	 */
    @Test
    public void testGetTheMinimumReturn0EmtpyArray() {
    	int[][] peoplesG2 = {};

        int result = FlyingCost.getMinimumCost(peoplesG2);

        assertEquals(0, result);

    }
    
}
