package stringbasedprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicateofwordsinastring{
	public static void main(String[] args){
		
		String str="Ram is a good boy but he is good he is good";
		int length=str.length();
		System.out.println(length);
		String [] words=str.split(" ");
		Map<String,Integer> wordMap=new HashMap<>();
		for(String st:words){
			if(wordMap.containsKey(st)){
			wordMap.put(st,wordMap.get(st)+1);}
			else{
				wordMap.put(st,1);
			}		
		}
		Set<String> keys=wordMap.keySet();
		for(String st:keys){
			
		if(wordMap.get(st)>1){
			//if u are want 
			System.out.println("String "+ st+  "  repeating  "+wordMap.get(st) +"  times  ");}}}}
	