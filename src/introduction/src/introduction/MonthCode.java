package introduction;
public class MonthCode {
	
String month;
int b;
	
public MonthCode(String month) {
	this.month = month;
 	

 switch (month) {
		
	case "jan" :
	case "Jan" :
			b=0;
		break;
	
	case "feb || mar || nov":
			b=3;
		break;
			
	case "apr || jul":
			b=6;
		break;
		
	case "may":
			b=1;
		break;
		
	case "jun":
		   b=4;
		break;

		
	case "aug":
			b=2;
		break;
		
	case "sep || dec":
			b=5;
		break;
		
	case "oct":
			b=0;
		break;
		
	case "nov":
			b=3;
		break; 
		
	case "dec":
			b=5;
		break; 
		
	default:
		System.out.println("Entered Wrong Month");
		}
}		
public int publishMonth()
{
	System.out.println("The value of month is " + b);
	return b;
}

}

