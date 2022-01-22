package introduction;

public class DayCode {
int Total1;

public DayCode(int Total1) {
	this.Total1 = Total1;
	if(Total1 == 0){
		  System.out.println("You born on Sunday");
	  }
	  else if(Total1 == 1) {
		  System.out.println("You born on Monday");
	  }
	  else if(Total1 == 2) {
		  System.out.println("You born on Tuesday");
	  }
	  else if(Total1 == 3) {
		  System.out.println("You born on Wednesday");
	  }
	  else if(Total1 == 4) {
		  System.out.println("You born on Thrusday");
	  }
	  else if(Total1 == 5) {
		  System.out.println("You born on Friday");
	  }
	  else if(Total1 == 6) {
		  System.out.println("You born on Saturday");
	  }
	  else {
		  System.out.println("Check your Entry;");
	  }
	}
}
