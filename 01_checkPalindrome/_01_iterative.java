public class _01_iterative{

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
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(l!=r){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="ABCDCBA";
        System.out.println(checkPalindrome(str));

    }
}