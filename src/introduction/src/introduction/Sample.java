package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Total Mark");
		int Total= Integer.parseInt(br.readLine());
		
		if(Total>=90 && Total<=100)
		{
	     System.out.println("1^st Grade");
		}
		else if(Total>=80 && Total<=89)
		{
	     System.out.println("2^st Grade");
		}
		else if(Total>=70 && Total<=79)
		{
	     System.out.println("3^rd Grade");
	    }
		else if(Total>=60 && Total<=69)
		{
	     System.out.println("4^th Grade");
		}
		else if(Total>=50 && Total<=59)
		{
	     System.out.println("6^th Grade");
		}
		if(Total<50)
		{
	     System.out.println("Work Hard For Next Time");
		}
		
	}

}
