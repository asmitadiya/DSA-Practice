package arrays;

import java.util.Arrays;

public class ShuffleArray {

    // LC - 1470: Shuffle the Array --> https://leetcode.com/problems/shuffle-the-array/
    static void main() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] newArr = shuffle(nums,n);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] shuffle(int[] nums, int n) {

        int[] shuffle = new int[nums.length];
        int index = 0;

        for(int i = 0 ; i<n; i++){
            shuffle[index]=nums[i];
            shuffle[index+1]=nums[i+n];
            index= index+2;
        }
        return shuffle;
    }
}
