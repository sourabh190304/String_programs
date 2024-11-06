package strings_by_hrishi_sir;

public class reverse_string {
	public static void main(String[] args) {
		//string
		String s1="hello";
		//covert string to array
		char ca[]=s1.toCharArray();
		int start=0;
		int end=s1.length()-1;
		
		//reverse using shift
		while(start < end) {
			char temp=ca[start];
			ca[start]=ca[end];
			ca[end]=temp;
			start++;
			end--;
			}
		
		//convert again to string
		String s2=new String(ca);
		System.out.println(ca);
		 
	}

}
