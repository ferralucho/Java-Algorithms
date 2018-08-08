/**
 * 
 */
package algorithms;

import java.util.HashMap;

/**
 * @author luciano ferrari
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public int[] twoSum(int[] nums, int targ) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int complement;
		for (int i = 0; i < nums.length; i++) {
			complement = targ - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { i, map.get(complement) };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution");
	}

}
