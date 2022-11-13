package stringbasedprograms;

public class Stringreverse {
		 public static void main(String[] args){
		 
		String Name="RameshbabuGvs";
		char[] reverse=Name.toCharArray();
		System.out.println(reverse);
		System.out.println(Name.length());
		
		for(int i=reverse.length-1;i>=0;i--){
			
			System.out.print(reverse[i]);
		}}}


