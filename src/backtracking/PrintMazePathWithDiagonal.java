package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePathWithDiagonal {
    static void main() {
        List<String> path = mazePathDiagonal("",3,3);
        System.out.println(path);
    }

    static List<String> mazePathDiagonal(String p ,int r , int c){

        if(r ==1 && c==1){
            List<String> ch = new ArrayList<>();
            ch.add(p);
            return ch;
        }
        List<String> list = new ArrayList<>();

        if(r>1 && c>1) {
            list.addAll(mazePathDiagonal('D' + p, r - 1, c-1));
        }

        if(r>1) {
            list.addAll(mazePathDiagonal('V' + p, r - 1, c));
        }
        if(c>1) {
            list.addAll(mazePathDiagonal('H' + p, r, c - 1));
        }

        return list;
    }
}
