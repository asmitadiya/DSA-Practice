package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    static void main() {
        int[] n = {0,0,1};
        moveZeroes(n);
        System.out.println(Arrays.toString(n));
    }

    public static void moveZeroes(int[] nums) {

        int insertpos = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                swap(nums, insertpos, i);
                insertpos++;
            }
        }
    }

    static void swap(int[] nums, int s , int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e]= temp;
    }
}
