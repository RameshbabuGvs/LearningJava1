package stringbasedprograms;

public class Removingwhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="  hello string java   ";  
		//System.out.println(s1+"javatpoint");//without trim()  
		//System.out.println(s1.trim());//with trim()
	System.out.println(s1.replaceAll("\\s", ""));
	String str="$java&string%programs^&";
	String str1="Ramesh1%%";
		//RemovingSmallCharacters
			System.out.println(str1.replaceAll("[a-z]", ""));
			//RemovingSpecialCharacters
			System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
			
			//RemovingCapitalCharacters
			System.out.println(str1.replaceAll("[A-Z]", ""));
			//RemovingNumbersinString
			System.out.println(str1.replaceAll("[0-9]", ""));
			

	}

}
