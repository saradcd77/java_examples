/***
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
LeetCode Easy Problem 
*/

class TwoSum {
	public int [] twoSum(int [] arr, int sum){
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++){
			if(map.containskey(sum - arr[i]))
				return new int [] { map.get(sum - arr[i]), i};
			else map.put(arr[i], i);
		}
		return new int[] {-1, -1};
	}
}