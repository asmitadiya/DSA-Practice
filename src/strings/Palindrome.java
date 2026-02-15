package strings;

public class Palindrome {

    static void main() {
        String s = "A man, a plan, a canal: Panama";
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1.toLowerCase());
        System.out.println(isPalindrome(s1));
    }

    public static boolean isPalindrome(String s) {

        String cleanString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = cleanString.length()-1;

        while(start <= end){
            if(cleanString.charAt(start)== cleanString.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
