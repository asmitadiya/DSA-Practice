package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Print Matrix and Paths
public class PrintMatrix {
    static void main() {
        boolean[][] maze = new boolean[][]{
                {true, true, true},
                {true, true , true},
                {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];

        mazeAllPaths("",maze ,0,0,path , 1);
    }

    static void mazeAllPaths(String p , boolean[][] maze , int r , int c, int[][] path , int step){

        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        //if the cell is false (means it is already visited) , then it should return to previous call
        if(!maze[r][c]){
            return;
        }

        //if it is not false , then that means I am considering this cell in my path
        // and hence make it as false
        maze[r][c] = false;
        path[r][c] = step;


        if(r<maze.length-1){
            mazeAllPaths(p+"D", maze, r+1 , c,path,step+1);
        }

        if(c<maze[0].length-1){
            mazeAllPaths(p+"R", maze, r , c+1,path,step+1);
        }
        if(r>0){
            mazeAllPaths(p+"U", maze, r-1 , c,path,step+1);
        }

        if(c>0){
            mazeAllPaths(p+"L", maze, r , c-1,path,step+1);
        }

        //this is where the function will be over
        //so before the function gets removed from the stack , also remove the changes that were
        //made by that function
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
