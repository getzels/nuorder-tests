package test.nuorder;

import org.apache.log4j.Logger;

/**
 * 
 * @author gndelossantos
 *
 */
public class FlyingCost {
	
	static final Logger logger = Logger.getLogger(FlyingCost.class);
	
	/**
	 * This method return the minimum cost to fly every 
	 * person to a city such that exactly N people arrive in each city.
	 * 
	 * Example:
     * Input: [[10,20],[30,200],[400,50],[30,20]]
     * Output: 110
	 * 
	 * @param peoples {@link int[][]}
	 * @return
	 */
	public static int getMinimumCost(int[][] peoples) {		
		/*
		 * If the value of the the input is null or equal 
		 * to zero the method immediately return 0
		 */
		if(peoples == null  || peoples.length == 0) {
			return 0;
		}
		
		//get the total of people
		int n = peoples.length;
		int cost = 0;
		
		//Loop from 0 to the total of people (n) 
		//time complexity O(n)
		for(int i = 0; i < n; i++) {
			
			/*
			To get the fly to city A peoples[i][0] and for city [i][1]
			the following if validate which cost is the minimum and sum that value
			to the value of the variable cost.
			*/
			if(peoples[i][0] < peoples[i][1]) {
				cost += peoples[i][0];
			}else {
				cost += peoples[i][1];
			}
		}
		
		return cost;
	}

	/**
	 * Main method for the execution of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Example input provide 
		int[][] peoples = {{10,20},{30,200},{400,50},{30,20}};
		
		logger.debug(String.format("The total minimum cost is %d", getMinimumCost(peoples)));
		
	}

}
