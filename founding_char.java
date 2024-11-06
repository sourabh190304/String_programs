package String_by_priyanka_mam;

public class founding_char {
	public static void main(String[] args) {
		String s1= ("hello");
		char ch='p';
		int cnt=0;
		for(int i=0; i<s1.length();i++) {
			if(s1.charAt(i)==ch) {
				cnt++;
			}
			else {
				System.out.println(s1.charAt(i));
			}
		}
		if(cnt==0) {
			System.out.println("not found+");
		}
	}

}
