package stringbasedprograms;

import java.util.HashMap;
import java.util.Map;

//Byusing for Loop
/*public class OccuranceofCharcter {
	public static void main(String[]args){
		int count;
		String str="amitabhbachan";
		char[] ar=str.toCharArray();
		int l=str.length();
		System.out.println(ar);
		System.out.println(l);
		
		for(int i=0;i<l;i++){
			count=1;
			for(int j=i+1;j<1;j++){
				if (ar[i]==ar[j]){
					count++;
					for(int k=j;k<l-1;k++){
						ar[k]=ar[k+1];
						}}}
			System.out.println(ar[i]+"="+count);
		}}}
*/

//by using for HashMap
public class OccuranceofCharcter{
	
	/*
	 * public static void main(String[]args) { String str="grape";
	 * Map<Character,Integer> charMapCount=new HashMap<>();
	 * 
	 * for(Character c: str.toCharArray()) { if(charMapCount.containsKey(c)) {
	 * charMapCount.put(c, charMapCount.get(c)+1); } else { charMapCount.put(c, 1);}
	 * } System.out.println(charMapCount); }
	 */
	
	
	 
	public static void main(String[] args) 
	{	
int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}
