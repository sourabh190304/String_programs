package strings_by_hrishi_sir;

public class Stringsplittoasc {
	public static void main(String[] args) {
		//pass the string s
		System.out.println("given : ");
		String s="hello and welcome";
		//print string s 
		System.out.println(s);
		System.out.println();
		//make that string to array and then split the empty spaces 
		String SA[]=s.split(" ");
		//print new string form by array String 
		for(String s2:SA) {
			System.out.println(s2);
		}
		//Sorted every eord in string array using sorting 
		for(int i=0; i<SA.length; i++) 
		{
			for(int j=i+1; j<SA.length; j++) 
			{
				if(SA[i].length()>SA[j].length())
				{
					String temp=SA[i];
					SA[i]=SA[j];
					SA[j]=temp;
				}
			}
		}
		//make string array in string and printed sorted array
		System.out.println();
		for(String SH:SA) 
		{
			System.out.println(SH);
		}
		//make empty string printed in string format 
		String s3="";
		System.out  .println();
		System.out.println("output : ");
		//for loop to store evry ele in SA string array 
		for(int i=0; i<SA.length; i++)
		{
			s3=s3+SA[i]+" ";
		}
		System.out.println(s3);
	}
}
