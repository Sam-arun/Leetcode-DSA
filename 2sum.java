public class TwoSum {

	/**
	 * Method to return the indices of 2 array elements that sum up to the given target value
	 * Time complexity - O(n)
	 * Space complexity - Best/Average of O(1) and Worst case of O(n)
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public int[] findPairWithSum(int[] array, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++) {
			int difference = target - array[i];
			if(map.containsKey(array[i])) {
				result[0] = map.get(array[i]);
				result[1] = i;
			} else {
				map.put(difference, i);
			}
		}
		return result;
	}
