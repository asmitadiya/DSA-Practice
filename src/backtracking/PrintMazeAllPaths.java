package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazeAllPaths {
    static void main() {
        boolean[][] maze = new boolean[][]{
                {true, true, true},
                {true, true , true},
                {true, true, true},
        };

        System.out.println(mazeAllPaths("",maze ,0,0));
    }

    static List<String> mazeAllPaths(String p , boolean[][] maze , int r , int c){

        if(r == maze.length-1 && c == maze[0].length-1){
            List<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        //if the cell is false (means it is already visited) , then it should return to previous call
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        //if it is not false , then that means I am considering this cell in my path
        // and hence make it as false
        maze[r][c] = false;


        List<String> list = new ArrayList<>();

        if(r<maze.length-1){
            list.addAll(mazeAllPaths(p+"D", maze, r+1 , c));
        }

        if(c<maze[0].length-1){
            list.addAll(mazeAllPaths(p+"R", maze, r , c+1));
        }
        if(r>0){
            list.addAll(mazeAllPaths(p+"U", maze, r-1 , c));
        }

        if(c>0){
            list.addAll(mazeAllPaths(p+"L", maze, r , c-1));
        }

        //this is where the function will be over
        //so before the function gets removed from the stack , also remove the changes that were
        //made by that function
        maze[r][c] = true;

        return list;
    }
}
