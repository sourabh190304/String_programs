package strings_by_hrishi_sir;

public class string_to_array {
	public static void main(String[] args) {
		//string
		String s1="Aapal Pune!";
		//printing string
		System.out.println(s1);
		//created new array of size string
		char ca[]=new char[s1.length()];
		//adding string ele in that array
		for(int i=0; i<s1.length(); i++) {
			ca[i]=s1.charAt(i);
		}
		//printed array
		for(char ch:ca) {
			System.out.print(ch);
		}
	}

}
