public class _01_bruteForce{

    public static boolean checkPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        str=str.toLowerCase();
        while(left<right)
        {
            char l=str.charAt(left);
            char r=str.charAt(right);

            if(!Character.isLetterOrDigit(l)){
                l++;
            }
            else if(!Character.isLetterOrDigit(r)){
                r--;
            }
            if(l!=r){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="ABCDCBA";
        System.out.println(checkPalindrome(str));

    }