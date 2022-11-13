package com.stringmethods;

public class Stringclass {

	public static void main(String[] args) {
	
		/*String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("java");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);   */
		/*
		//Append method
		StringBuilder s1 = new StringBuilder("Hello");    //String 1  
        StringBuilder s2 = new StringBuilder(" World");    //String 2  
        StringBuilder s = s1.append(s2);   //String 3 to store the result  
            System.out.println(s.toString());  //Displays result  
	
            //concatination method
            String s3="Sachin ";  
            String s4="Tendulkar";  
            String s5=s3.concat(s4);  
            String s6=new String(" World");
            System.out.println(s6+s3);
            System.out.println(s5);//Sachin Tendulkar 
            System.out.println(s3+s1);
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1); 
		String s="india is my country".concat(s1);
		System.out.println(s);*/
		//ends with
		String str="Welcome to Rameshbabu you";
		System.out.println(str.endsWith("you"));
		if(str.endsWith("you")) {
	System.out.println("String ends with you");
		}
		else {
			System.out.println("it doesnot ends with you");
		}
		System.out.println("Hi");
		//starts with 
		String string="HI Ramesh";
		System.out.println(string.startsWith(""));
		
            
            

	}

}
