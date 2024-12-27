package StringTokenizer;

import java.util.StringTokenizer;

public class STExample {
	public static void main(String args[]) {
		StringTokenizer st=new StringTokenizer("my name is shivani");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			
			StringTokenizer st1=new StringTokenizer("my,name,is,shivani");
			System.out.println("next token is:"+st.nextToken());
			
			StringTokenizer st2=new StringTokenizer("have a nice day everyone");
			System.out.println("the count is:"+st2.countTokens());
			
		}
	}

}
