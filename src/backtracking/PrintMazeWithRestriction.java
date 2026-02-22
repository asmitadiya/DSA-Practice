package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazeWithRestriction {
    static void main() {
        boolean[][] maze = new boolean[][]{
            {true, true, true},
            {true, false , true},
            {true, true, true},
        };

        System.out.println(mazeRestriction("",maze ,0,0));
    }

    static List<String> mazeRestriction(String p , boolean[][] maze , int r ,int c){

        if(r == maze.length-1 && c == maze[0].length-1){
            List<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        if(!maze[r][c]){
           return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();

        if(r<maze.length-1){
            list.addAll(mazeRestriction(p+"D", maze, r+1 , c));
        }

        if(c<maze[0].length-1){
            list.addAll(mazeRestriction(p+"R", maze, r , c+1));
        }

        return list;
    }
}
