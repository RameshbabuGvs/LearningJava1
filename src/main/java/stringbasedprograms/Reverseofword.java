package stringbasedprograms;

public class Reverseofword {
public static void main(String []args){
	String str="This is Rameshbabu";
	String str1="";
	String a[]=str.split(" ");
	
	//for(int i=0;i<a.length;i++){
		//System.out.print(a[i]+" ");}
	System.out.println(str);
	
	System.out.println();
	for(int i=a.length-1;i>=0;i--){
		//System.out.print(a[i] +" ");
		str1=str1+a[i] + " ";
	}
	System.out.print(str1);
	
}
}