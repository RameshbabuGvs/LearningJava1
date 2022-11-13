package stringbasedprograms;

import java.util.Scanner;

public class RemovenumbersinString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sde345derf";
		str = str.replaceAll("[a-z]", ""); 
		
		System.out.println(str);
		
		
		/*
		Scanner sc = new Scanner(System.in);
        
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
        sc.close();*/
    }
	}


