import java.util.*;
public class LongestSubstringLength {
    public static void lengthLongestSubstring(String s) {
        int maxLength =0;
        int newStart=0,right=0, n=s.length();
        HashMap<Character,Integer> hs = new HashMap();
        
        for (; right < n; right++) {
            char c = s.charAt(right);
            
            if (hs.containsKey(c)) {
                newStart = Math.max(newStart, hs.get(c) + 1);
            }
            
            hs.put(c, right);
            maxLength = Math.max(maxLength, right - newStart + 1);
        }
        System.out.println(maxLength);
    }

    public static void main(String args[]) {
        lengthLongestSubstring("prabaharan");
    }
}