package LeetCode;

public class S12_IntToRoman {
	public static String Convert(int n) {
		String strRoman="";
		int value[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String roman[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i=0;i<value.length;i++) {
			while(n>=value[i]) {
				strRoman+=roman[i];
				n-=value[i];
			}
		}		
		return strRoman;
	}
}
