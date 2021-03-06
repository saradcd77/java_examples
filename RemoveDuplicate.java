/***

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

*/

package com.practise;

public class RemoveDuplicates {

    public static int removeDuplicates(int [] nums){
        int counter = 1;
        for(int i = 0; i < nums.length-1 ; i ++){
          if (nums[i] != nums[i+1]){
              nums[counter] = nums[i];
              counter++;
          }
        }
        return counter;
    }
