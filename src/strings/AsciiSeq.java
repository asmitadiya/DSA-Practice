package strings;

import java.util.ArrayList;

/*
Subsequences with ASCII values
Find all the sub sets or sub sequences of string "abc" along with the ascii values
use both the approaches where return type is void and ArrayList<String>
 */
public class AsciiSeq {
    static void main() {
        String s = "abc";
        ArrayList<String> l = helper("",s);


        System.out.println(l);
    }

    public static ArrayList<String> helper(String str , String t){
        if(t.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(str);
            return l;
        }

        char ch = t.charAt(0);

        ArrayList<String> left = helper(str,t.substring(1));
        ArrayList<String> right = helper(str+ch, t.substring(1));
        ArrayList<String> ascii = helper(str+(ch+0),t.substring(1));

        right.addAll(ascii);
        left.addAll(right);

        return left;
    }
}
