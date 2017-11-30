package LeetCode;

import java.util.HashMap;

public class S03_LongestSubstringWithoutRepeatingChars {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==0)return 0;
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		int start=-1,max=0;
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				start=Math.max(start,map.get(s.charAt(i)));
			}
			map.put(s.charAt(i), i);//Key值相同时，覆盖Value值。
			max=Math.max(max, i-start);	
		}
		return max;
	}
}
