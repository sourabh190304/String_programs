package strings_by_hrishi_sir;

public class sorting_string {
	public static void main(String[] args) {
		//fst String
		System.out.println("string before sorting : ");
		String s1="987654321";
		//print s1
		System.out.println(s1);
		//covert s1 string to char ca array
		char ca[]=s1.toCharArray();

		//sorted that array 
		for(int i=0; i<ca.length; i++) {
			for(int j=i+1; j<ca.length; j++) {
				if(ca[i]>ca[j]) {
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
				}
			}
		}
		System.out.println("string after sorting : ");
		//formed new string using that ca array
		String s2=new String(ca);
		//printed s2 string 
		System.out.println(s2);

	}	
}
