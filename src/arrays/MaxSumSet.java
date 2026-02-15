package arrays;

//Constant window two pointer
// maximum sum set consecutively in an array where k = 4 . meaning the subset will be of 4
public class MaxSumSet {

    static void main() {
        int [] arr = {-1,2,3,3,4,5,-1};
        int k = 4 ;

        System.out.println(maxSum(arr,4));
    }

    static int maxSum(int[] arr , int k){
        int l = 0;
        int r = k-1;
        int maxSum =0 ;

        for(int i = l; i<=r; i++){
            maxSum = maxSum+arr[i];
        }

        while(r<arr.length-1) {
            int sum = maxSum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
