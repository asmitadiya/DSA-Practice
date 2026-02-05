package searching;

public class SearchInsertPosition {
    //LC 35 - https://leetcode.com/problems/search-insert-position/
    static void main() {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5));
    }
    static int OptimisedsearchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return start;
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        if(start == 0 && end == -1){
            return 0;
        }else if(target > nums[start-1]){
            return start;
        }else{
            return end;
        }


    }
}
