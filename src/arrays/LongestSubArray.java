package arrays;

//find the longest subarray where sum <= k and k =14 here and the array is {2,5,1,7,10}
public class LongestSubArray {
    static void main() {
        int[] arr = {2,5,1,7,10};
        System.out.println(maxlengthBrute(arr,14));
        System.out.println(maxLengthBetter(arr,14));
    }

    static int maxlengthBrute(int [] arr, int k){

        int maxLength = 0;

        //generate all the subarrays
        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum <= k){
                    maxLength = Math.max(maxLength,j-i+1);
                }else{
                    break;
                }
            }
        }

        return maxLength;
    }

    static int maxLengthBetter(int[] arr , int k){
        int l = 0;
        int r = 0;
        int maxlength = 0;
        int sum = 0;

        while(r<arr.length){
            sum = sum +arr[r];

            while(sum>k){
                sum= sum-arr[l];
                l++;
            }

            if(sum<=k){
                maxlength = Math.max(maxlength,r-l+1);
                r++;
            }
        }

        return maxlength;
    }
}
