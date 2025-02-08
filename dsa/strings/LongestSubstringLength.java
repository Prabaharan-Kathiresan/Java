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
            System.out.println(maxLength);
        }
        //System.out.println(maxLength);
    }

    public static void main(String args[]) {
        lengthLongestSubstring("dvdf");
        
        //approach2("pwwkew");
    }


    /** brute force approach 
     * solution accepted in leetcode
    */
    public static void approach2(String s) {
        ArrayList<Character> al = new ArrayList<>();
        int longestStrLength=0;
        for(int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if(!al.contains(c)) {
                al.add(c);
                continue;
            }
            if(longestStrLength<al.size()) {
                longestStrLength=al.size();
            }
            for(int j=0;al.contains(c);) {
                al.remove(j);
                if(al.size()==0) {
                    break;
                }
            }
            al.add(c);
        }
        if(longestStrLength<al.size()) {
            longestStrLength=al.size();
        }
        System.out.println(longestStrLength);
    }
}