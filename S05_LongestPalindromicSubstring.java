package LeetCode;

import java.util.Scanner;

public class S05_LongestPalindromicSubstring {
	public static void main(String[]argus)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();		
		in.close();
		System.out.print(longestPalidrome(s));
	}
	/*
	 * 找出字符串中最长的回文子串
	 * Key idea, every time we move to right, 
	 * we only need to consider whether using this new character 
	 * as tail could produce new palindrome string
	 * of length (current length +1) or (current length +2)
	*/
	public static String longestPalidrome (String s) 
	{
		String res="";
		int currLength=0;
		for(int i=0;i<s.length();i++) {
			if(isPalidrome(s,i-currLength-1,i)) {
				res=s.substring(i-currLength-1, i+1);
				currLength+=2;
			}
			else if(isPalidrome(s,i-currLength,i)) {
				res=s.substring(i-currLength, i+1);
				currLength+=1;
			}
		}		
		return res;		
	}
	//判断某段是否为回文
	public static boolean isPalidrome(String s,int begin,int end) {
		if(begin<0)return false;
		while(begin<end) {
			if(s.charAt(begin++)!=s.charAt(end--))return false;
		}
		return true;		
	}
}
