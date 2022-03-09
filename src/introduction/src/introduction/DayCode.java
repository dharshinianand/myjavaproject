package introduction;
public class DayCode {
int Total1;

public DayCode(int Total1) {

	this.Total1 = Total1;
	
	if(Total1 == 0){
		  System.out.println("You born on 'SUNDAY'");
	  }
	  else if(Total1 == 1) {
		  System.out.println("You born on 'MONDAY'");
	  }
	  else if(Total1 == 2) {
		  System.out.println("You born on 'TUESDAY'");
	  }
	  else if(Total1 == 3) {
		  System.out.println("You born on 'WEDNESDAY'");
	  }
	  else if(Total1 == 4) {
		  System.out.println("You born on 'THURSDAY'");
	  }
	  else if(Total1 == 5) {
		  System.out.println("You born on 'FRIDAY'");
	  }
	  else if(Total1 == 6) {
		  System.out.println("You born on 'SATURDAY'");
	  }
	  else {
		  System.out.println("Check your Entry;");
	  }
	}
}
