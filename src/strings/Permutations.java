package strings;

import java.util.ArrayList;

/*
return all the permutations of string = "abc"
 */
public class Permutations {

    static void main() {

        String s = "abc";
        ArrayList<String> per = permutations("",s);
        System.out.println(per.toString());

    }

    static ArrayList<String> permutations(String p , String up){

        ArrayList<String> l = new ArrayList<>();

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
             l.addAll(permutations(first+ch+last, up.substring(1)));
        }

        return l;

    }

}
