public class ValidPalindrome {
    public static boolean validPalindrome(String s) {
        int left=0, right=s.length()-1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Prabaharan="+ validPalindrome("Prabaharan"));
        System.out.println("madam="+ validPalindrome("madam"));
         System.out.println("maddam="+ validPalindrome("maddam"));
    }
}