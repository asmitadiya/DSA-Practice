package arrays;

public class RichestCustomerWealth {


    // LC - 1672: Richest Customer Wealth --> https://leetcode.com/problems/richest-customer-wealth/
    static void main() {
        RichestCustomerWealth rcw = new RichestCustomerWealth();
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(rcw.maximumWealth(accounts));
    }

    public static int optimisedMaxWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int bank = 0; bank < accounts.length; bank++) {
            int cusWealth = 0;
            for (int acct = 0; acct < accounts[bank].length; acct++) {
                cusWealth += accounts[bank][acct];
            }
            if (cusWealth > maxWealth) {
                maxWealth = cusWealth;
            }
        }
        return maxWealth;
    }

    public int maximumWealth(int[][] accounts) {

        int[] amt = new int[accounts.length];

        for(int r = 0; r < accounts.length ; r++){
            for(int c = 0; c < accounts[r].length; c++){

                if(c==0){
                    amt[r]=accounts[r][c];
                }else{
                    amt[r]+=accounts[r][c];
                }

            }
        }

        return max(amt);

    }

    // function to find max in an array
    int max(int[] arr){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }

        return arr[max];
    }
}
