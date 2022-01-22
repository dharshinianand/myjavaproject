package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Scanner;

public class FindDay_UsingDOB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter Your Date");
		int date = Integer.parseInt(br.readLine());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Month");
		String month = sc.nextLine(); 
		
		System.out.println("Enter Your Year");
		int year = Integer.parseInt(br.readLine());
		
		YearCode obj = new YearCode(year);
			int a1 = obj.publish();	
			
	    MonthCode obj1 = new MonthCode(month);
	        int b1 = obj1.publishMonth();
	        int c1 = a1+b1;
	        System.out.println(c1);
	        
	 	        
	        int Moduls = (year % 100);
	        System.out.println(Moduls);
	        
	        int Quot = (Moduls / 4);
	        System.out.println(Quot);
	        
	        int d1 = (year % 4);
	        int Total1;
	
	    	int Total =(date + c1 + Moduls + Quot) % 7;
	    	   System.out.println(Total);
	    	   
	     if (((month.equalsIgnoreCase("jan")) || (month.equalsIgnoreCase("feb")) && d1==0 ))
	     {
	    	 Total1 = (Total-1);
	     }else
	    	 {
	    	 Total1 =(Total);
	     }
	     
	    DayCode obj2 = new DayCode(Total1);
	    
	}

}          
