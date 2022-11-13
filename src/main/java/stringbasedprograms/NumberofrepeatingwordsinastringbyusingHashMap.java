package stringbasedprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumberofrepeatingwordsinastringbyusingHashMap{
	public static void main(String[] args){
		
		String str="grape is is";
		int length=str.length();
		System.out.println(length);
		String [] words=str.split(" ");
		Map<String,Integer> wordMap=new HashMap<>();
		for(String st:words){
			if(wordMap.containsKey(st)){
			wordMap.put(st,wordMap.get(st)+1);
			}
			else{
				wordMap.put(st,1);
			}		
		}
		Set<String> keys=wordMap.keySet();
		for(String st:keys){
			
		if(wordMap.get(st)>1){
			//if u are want 
			System.out.println("Character "+ st+  "  repeating  "+wordMap.get(st) +"  times  ");	
		}		
		}
		}
		}
	