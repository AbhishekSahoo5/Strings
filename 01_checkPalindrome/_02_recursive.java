
public class _02_recursive {

    // For a single string

    public static boolean checkPalindrome(String str)
    {
        return palindrome(str, 0);
    }
    public static boolean palindrome(String str, int i)
    {
        int l=str.length();
        if(str.charAt(i)!=str.charAt(l-i-1)){
            return false;
        }
        if(i>=l/2){
            return true;
        }
        return palindrome(str, i+1);
    }
    public static void main(String[] args) {
        String str="ABCDCBA";
        System.out.println(checkPalindrome(str));

    }
    
}
