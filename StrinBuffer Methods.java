package StringBuffer;

public class AllMethods {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.append("java"));
		System.out.println(sb.capacity());
		System.out.println(sb.append("java programming"));
		System.out.println(sb.capacity());
		
		
		
		StringBuffer sb1=new StringBuffer("javalanguage");
		//System.out.println(sb1.append("code"));
		System.out.println(sb1.charAt(4));
		System.out.println(sb1.delete(2, 6));
		System.out.println(sb1.deleteCharAt(6));
		System.out.println(sb1.insert(5,"shivani"));
		System.out.println(sb1.replace(2, 5, "k"));
		System.out.println(sb1.reverse());
		System.out.println(sb1.substring(3));
		System.out.println(sb1.substring(2,5));
		System.out.println(sb1.subSequence(2,6));
		
		
	}

}
