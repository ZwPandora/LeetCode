package LeetCode;

public class S38_CountAndSay {
	public String countAndSay(int n) {		
    	StringBuilder sb=new StringBuilder("1");
    	String s=String.valueOf(n);
    	int count=0;
    	char say=s.charAt(0);
        for (int i=0;i<s.length();i++){
        	if (s.charAt(i)!=say){
        		sb.append(count).append(say);
        		count=1;
        		say=sb.charAt(i);
        	}
        	else count++;
        }
        sb.append(count).append(say);      	        
        return sb.toString();
        
	}
}
