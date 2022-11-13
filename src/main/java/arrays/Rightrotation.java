package arrays;

public class Rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int arr2[]= {3,1,4,5,6,7};
		/*for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");}
	    int noofTimes=2;
		for(int k=0;k<noofTimes;k++) {
			int lastelement=arr2[arr2.length-1];
			for(int j=arr2.length-1;j>0;j--) {
				arr2[j]=arr2[j-1];}
			arr2[0]=lastelement;
			}
		System.out.println("Right rotation");
		for(int l=0;l<arr2.length;l++) {
			System.out.print(arr2[l]+ " ");
		}
		*/
		//Left rotation Array
		int noOfTimes=2;
		for(int k=0;k<noOfTimes;k++) {
			int firstElement = arr2[0];
			for(int j=0;j<arr2.length-1;j++) {
				arr2[j]=arr2[j+1];
			}
			arr2[arr2.length-1]=firstElement;	}
		System.out.println();
		for(int l=0;l<arr2.length;l++) {
			System.out.print(arr2[l]+" ");}
		
	}}
