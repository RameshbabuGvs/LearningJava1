package arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marksArray= {14,15,50,60,12};
		
		int temp;
		for(int i=0;i<marksArray.length;i++) {
			for(int j=i;j<marksArray.length;j++) {
				if(marksArray[i]<marksArray[j]) {
					temp=marksArray[i];
					marksArray[i]=marksArray[j];
					marksArray[j]=temp;
				}}}
		for(int a :marksArray) {
			
			System.out.println(a);
		}

	}

}
