package stringbasedprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesinString {
		public static void main(String [] args){
		
		String str="RRameshbabu";
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<length;i++){
		for(int j=i;j<length+i;j++){
			
			
		if(ch[i]==ch[j]){
		System.out.println("Duplicates characters are : "+ch[j]);
		break;
		}
		}
		}
		}
	}

/*
// finding Duplicates Count in String by using HASH Map
public class DuplicatesinString{
	public static void main(String[] args){
		
		String str="Rameshbabu";
		int length=str.length();
		System.out.println(length);
		char[] chars=str.toCharArray();
		Map<Character,Integer> charMap=new HashMap<>();
		for(Character ch:chars){
			
			if(charMap.containsKey(ch)){
			charMap.put(ch,charMap.get(ch)+1);}
			else{
			charMap.put(ch,1);
			}		
		}
		Set<Character> keys=charMap.keySet();
		for(Character ch:keys){
			
		if(charMap.get(ch)>1){
			//if u are want 
			System.out.println("Character "+ ch+  "  repeating  "+charMap.get(ch) +"  times  "); }}}}
	
			
		*/
		
		
		
	
	
