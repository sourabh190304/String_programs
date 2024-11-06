package strings_by_hrishi_sir;

public class ReverseEveryWordInString {
	public static void main(String[] args) {
		String s="Hello and Welcome";
		// String -> String[]> ["Hello", "and", "Welcome"!
		String sa[]=s.split(" ");
		// char CA[] = {'H', 'e', '1', 'l', 'o'};
		
		for(int i=0; i<sa.length; i++) {
			 // String temp "Hello";
			String temp=sa[i];
			// char CA[] = {'H', 'e', '1', 'l', 'o'};
			char ca[]=temp.toCharArray();
			// char CA[] = {'H', 'e', '1', 'l', 'o'};
			int start=0;
			int end=ca.length-1;
			// char CA[] = {'o', 1', '1', 'e', 'H'};
			//rev char[]> string -> olleh
			while(start<end) {
				char ch=ca[start];
				ca[start]=ca[end];
				ca[end]=ch;
				start++;
				end--;
			}
			// String[] -> ["olleh", "dna", "emoclew"];
			String s2=new String(ca);
			//s2=s2+ca[i]+" ";
			sa[i]=s2;
			//System.out.println(s2);
			
			
		}
		 // String[] -> String
		   // "olleh dna emoclew"
		String s4="";
		for(int i=0; i<sa.length; i++) {
			s4=s4+sa[i]+" ";
		}
		System.out.println(s4);
		
	}

}
