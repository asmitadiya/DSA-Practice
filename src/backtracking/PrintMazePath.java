package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePath {
    static void main() {
        List<String> path = mazePath("",3,3);
        System.out.println(path);
    }

    static List<String> mazePath(String p ,int r , int c){

        if(r ==1 && c==1){
            List<String> ch = new ArrayList<>();
            ch.add(p);
            return ch;
        }
        List<String> list = new ArrayList<>();

        if(r>1) {
            list.addAll(mazePath('d' + p, r - 1, c));
        }
        if(c>1) {
            list.addAll(mazePath('r' + p, r, c - 1));
        }

        return list;
    }
}
