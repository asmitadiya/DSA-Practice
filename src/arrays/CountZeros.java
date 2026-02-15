package arrays;

//Count the number of zeros in a number
public class CountZeros {
    static void main() {
        int count = 0;
        System.out.println(zeros(30402,count));
    }

    static int zeros(int n, int count){

        if(n==0){
           return count ;
        }
        if(n%10 ==0){
            return zeros(n/10, count+1);
        }
        return zeros(n/10, count);
    }
}
