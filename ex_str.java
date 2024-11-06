package String_by_shubhangi_mam;

public class ex_str {
	public static void main(String[] args) {
		//s3
		String s2=new String("Starting of String :");
		System.out.println(s2);
		//s2
		String s3=new String("PUNEKAR");
		System.out.println(s3);
		//s
		String s=" hey beautiful!";
		String s4=" hey beautiful!";
		//print s
		System.out.println(s);
		//print char from that particular index using charAt()
		System.out.print(s.charAt(0));
		System.out.print(s.charAt(1));
		System.out.print(s.charAt(2));
		
		System.out.println();
		//print length of String
		System.out.println(s.length());
		//convert string to uppercase
		System.out.println(s2.toUpperCase());
		//convert string to lowercase
		System.out.println(s3.toLowerCase());
		//check string is empty or not
		System.out.println(s3.isEmpty());
		//check index of given char
		System.out.println(s2.indexOf('i'));
		//check index if repeated then last index of that char
		System.out.println(s2.lastIndexOf('i'));
		//replace the ele in string 
		System.out.println(s.replace('y','e'));
		//to remove start and end space we use trim
		System.out.println(s.trim());
		//to use replace in string line
		String s1="Jay Bolo Ram!";
		System.out.println(s1.replace("Bolo","Shri"));
		//concat given string is end of another string 
		//basically to join two strings
		System.out.println(s.concat(" "+s3));
		//check both strings are equal or not 
		System.out.println(s.equals(s4));
		System.out.println(s.equals(s3));
		//compare litreals unicode char 
		System.out.println(s.compareTo(s2));
		//to compare to strings content with another string
		System.out.println(s.contentEquals(s4));
		//stats with use to check content start with particular format
		System.out.println(s1.startsWith("Jay"));

		
		
	}

}
