package strings;

public class Anagram {
    static void main() {
        String s = "anagram";
        System.out.println(isAnagram("aangram","anagram"));
    }

    public static boolean isAnagram(String s, String t) {

        //at first you can check if the lengths are equal
        if(s.length()!=t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i<s.length();i++){
            //increment for s
            count[s.charAt(i)-'a']++;
            //decrement for t
            count[t.charAt(i)-'a']--;
        }

        for(int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
