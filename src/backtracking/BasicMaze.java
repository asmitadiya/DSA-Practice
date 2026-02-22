package backtracking;

public class BasicMaze {
    static void main() {
        System.out.println(countMaze(3,3));
    }

    static int countMaze(int r , int c){

        if(r==1 || c==1){
            return 1 ;
        }

        int left = countMaze(r-1,c);
        int right = countMaze(r,c-1);

        return left+right;

    }
}
