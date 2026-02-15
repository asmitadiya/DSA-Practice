package sort;

import java.util.Arrays;

/*remember cyclic sort will only happen for range 1 to n or 0 to n
hence anytime you have a question where it is mentioned that range is 1 to n or 0 to n , then apply
cyclic sort
Complexity is O(n) -->  just in one pass
 */
public class CyclicSort {
    static void main() {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int[] arr){

        int i =0;
        while(i<arr.length){

            int correctIndex = arr[i]-1;
            if(arr[i] == arr[correctIndex]){
                i++;
            }else{
                swap(arr, i , correctIndex);
            }

        }

    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
