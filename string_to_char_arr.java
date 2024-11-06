package strings_by_hrishi_sir;

public class string_to_char_arr {
public static void main(String[] args) {
	String s1=new String("hello");
	System.out.println(s1);
	
	
	char ac[]=new char[5];
	//copying elements from string to array
	for(int i=0; i<ac.length; i++) {
		//using char at predefined function
		ac[i]=s1.charAt(i);
	}
	
	
	for(char ch:ac) {
		System.out.print(ch);
	}
	System.out.println();
	
	
	//reverse array using for loop
	for(int i=ac.length-1; i>=0; i--) {
		System.err.print(ac[i]);
	}
   }
}
