package introduction;
public class YearCode {
	int year;
	int a;
	
public YearCode(int year) {
		this.year = year;
		
		if (year>=1600 && year<=1699) {
			a=6;
				}
		else if (year>=1700 && year<=1799) {
			a=4;
				}
		else if (year>=1800 && year<=1899) {
			a=6;
				}
		else if (year>=1900 && year<=1999) {
			a=0;
			   }
		else if (year>=2000 && year<=2099) {
			a=6;
			  }
		else if (year>=2100 && year<=2199) {
			a=4;
			  }
		else 
		{
			System.out.println("Enter the Valid Year");
			}
		
	}
		
public int publish()
	{
		//System.out.println("The value of year is " + a);
		return a;
	}
	
}
	
