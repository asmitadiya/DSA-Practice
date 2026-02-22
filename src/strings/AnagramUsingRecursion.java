package strings;

import java.util.ArrayList;

class AnagramUsingRecursion {
    public boolean isAnagram(String s, String t) {

        ArrayList<String> results = helper("",t);

        if(results.contains(s)){
            return true;
        }else{
            return false;
        }
        
    }

    ArrayList<String> helper(String p , String up){

        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);

        for(int i = 0 ; i<=p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            list.addAll(helper(first+ch+second,up.substring(1)));
        }

        return list;

    }
}