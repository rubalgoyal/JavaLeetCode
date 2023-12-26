/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(target <= -Math.pow(10,9) || target >= Math.pow(10,9)){
            return result;
        }

        if(nums.length >= 2 && nums.length <= 10000){
            boolean isFound = false;
            for(int i = 0; i < nums.length - 1; i++){
                    if(nums[i] <= -Math.pow(10,9) || nums[i] >= Math.pow(10,9)){
                        return result;
                    }
                    for(int j = i+1; j < nums.length; j++ ){
                        if(nums[i]+ nums[j] == target){
                            result[0] = i;
                            result[1] = j;
                            isFound = true;
                            break;
                        }
                    }
                    if(isFound)
                        break; 
            } 
        }
        
        return result;
        
    }
}

// Second alternate solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            if(values.containsKey(target - nums[i])){
                return new int[] {i, values.get(target - nums[i])};
            }
            values.put(nums[i], i);
        }

        return new int[] {};
        
    }
}
