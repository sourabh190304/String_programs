package strings_by_hrishi_sir;

public class conversion_methods_in_string {
	public static void main(String[] args) {

		//string to char[]
		String s1="hello";
		char ca[]=s1.toCharArray();

		//char [] to string 
		char ch []= {'j','k'};
		String s2=new String(ch);

		// String to String []
		String s3="jay shri ram";
		String sa[]=s3.split(" ");

		// string[] to string
		String ch1 []= {"hello","hey"};
		String s4="";
		for(int i=0; i<ch1.length; i++) {
			s4=s4+ch1[i]+" ";
		}
	}

}
