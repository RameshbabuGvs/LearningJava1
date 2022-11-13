package arrays;

public class TwodimensionalArray {

	public static void main(String[] args) {
	    
	    // declare and initialize an array
	    //int[][][] arr = { {{1,2},{3,4},{5,6}}, {{7,8},{9,1},{2,3}} };
		int [][] array= { {1,2},{2,3},{3,4}};
		System.out.println(array.length);
	    for(int i=0;i<array.length;i++) {
	    	for(int j=0;j<array[i].length;j++) {
	    		
	    		System.out.print(array[i][j]+" ");
	    	}
	    }
	    /*// display array length
	    System.out.print("The length of the given array = ");
	    System.out.println(arr.length);
	    System.out.println("arr[0] length = " + arr[0].length);
	    System.out.println("arr[0][0] length = " + arr[0][0].length);
	    System.out.println("arr[0][1] length = " + arr[0][1].length);
	    System.out.println("arr[0][2] length = " + arr[0][2].length);*/
	  }
	

}
