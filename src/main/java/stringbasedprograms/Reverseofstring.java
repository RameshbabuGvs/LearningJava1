package stringbasedprograms;

public class Reverseofstring {
	
	public static void main(String []args){
		
	String inputstring="grape";
	
	System.out.println(" Before String: "+inputstring);
	char[] chars=inputstring.toCharArray();
	int length=chars.length;
	System.out.println(length);
	
	
	//Method1
	for(int i=length-1;i>=0;i--){
		
		System.out.print(chars[i]);
	}
	
	
	/*  //Method2 String reverseword=""; 
	for(int i=length-1;i>=0;i--){
	  reverseword=reverseword+inputstring.charAt(i); }
	  
	  System.out.println(reverseword);*/
	 
	  /*//Method3 System.out.println("\n-------------------");
	  
	  StringBuffer stringbuffer=new StringBuffer(inputstring);
	  System.out.println(stringbuffer.reverse());*/
	 
	
	
}
	



}
