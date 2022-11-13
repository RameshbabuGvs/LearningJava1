package stringbasedprograms;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ramesh with tvs next  ";
		//"RAMESH & with & TVS & next"
		
		int length=str.length();
		//System.out.println(length);
		 String Replaceword=str.replace(" ", "&");
		// System.out.println(Replaceword);
		 String RemoveSpaces=Replaceword.substring(0, 20);
		 //System.out.println(RemoveSpaces);
		 String capitalletters=RemoveSpaces.replace("ramesh", "RAMESH");
		 //System.out.println(capitalletters);
		 String sceoncdapitalletters=capitalletters.replace("tvs", "TVS");
		 System.out.println("//"+sceoncdapitalletters);
		 
		
		
		/*//192837465564738291
		
		int i=192837465564738291;
		for(i=1;i>i){}
*/
		
		/*int i=5;
		for(i=5;i>=-6;i--)
		{
			System.out.print(i);
		}*/
		
	}

}
