package strings;

import java.util.ArrayList;

/*
Find all the sub sets or sub sequences of string "abc"
use both the approaches where return type is void and ArrayList<String>
 */
public class SubSeq {
    static void main() {
        String s = "ahbgdc";
        ArrayList<String> l = helper("",s);

        System.out.println(l);
    }

    public static ArrayList<String> helper(String str , String t){

        if(t.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }

        char c = t.charAt(0);

        ArrayList<String> left = helper(str+c , t.substring(1));
        ArrayList<String> right = helper(str, t.substring(1));

        left.addAll(right);

        return left;


    }
}
