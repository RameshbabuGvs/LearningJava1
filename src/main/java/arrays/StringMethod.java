package arrays;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s ="Welcome";
	
	System.out.println(s.length());//This is Usefull for Finding string length
	//Concatination Method
	String s1 ="Welcome to";
	String s2 = "java";
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	System.out.println("Welcome to" + "java");

	//Equals
	String s3="Welcome";
	String s4="WElcome";
	System.out.println(s3.equals(s4));//false
	System.out.println("Hi " +s3==s4);
	//Equalsignorecase
	System.out.println(s3.equalsIgnoreCase(s4));//true
	
	//contains
	
	System.out.println(s3.contains("Welcome"));//true
	//Substring(0,3)it means 0===is Starting Index,3===Ending Index
	
     /* 0 1 2 3 4 5 6
	    W e l c o m e  ";
        1 2 3 4 5 6 7  */
System.out.println(s.substring(0, 3));	//--w  e l
	System.out.println(s.substring(2, 5)); //l c o
	
	//Replace
	System.out.println(s.replace('e', 'a'));
	System.out.println(s.replace("come", "kome"));
	
	
	}

}
