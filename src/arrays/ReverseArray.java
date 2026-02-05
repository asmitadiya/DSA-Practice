package arrays;

import java.util.Arrays;

public class ReverseArray {

    static void main() {
        int[] arr = {8,4,21,5,3,1};
        System.out.println(reverse(arr));

    }
    static String reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){

            swap(arr, start, end);
            start++;
            end--;

        }
        return Arrays.toString(arr);
    }

    static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;
        return arr;
    }
}
