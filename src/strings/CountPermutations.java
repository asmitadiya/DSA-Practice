package strings;

import java.util.ArrayList;

/*
in this instead of returning all the permutations , return the count of permutations
 */
public class CountPermutations {

    static void main() {

        String s = "abc";
        int per = count("",s);
        System.out.println(per);

    }

    static int count(String p , String up){

        int c = 0;

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            c = c + count(first+ch+last, up.substring(1));
        }

        return c;

    }
}
