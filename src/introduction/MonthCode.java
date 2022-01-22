package introduction;

public class MonthCode {
    String month;
	int b;
	
	public MonthCode(String month) {
		this.month = month;
		
		switch (month) {
		
		case "jan":
				b=0;
			//System.out.println(b);
			break;
	
		case "feb":
			b=3;
		//System.out.println(b);
		break;
		
		case "mar":
			b=3;
		//System.out.println(b);
		break;
		
		case "apr":
			b=6;
		//System.out.println(b);
		break;
		
		case "may":
			b=1;
		//System.out.println(b);
		break;
		
		case "jun":
			b=4;
		//System.out.println(b);
		break;
		
		case "jul":
			b=6;
		//System.out.println(b);
		break;
		
		case "aug":
			b=2;
		//System.out.println(b);
		break;
		
		case "sep":
			b=5;
		//System.out.println(b);
		break;
		
		case "oct":
			b=0;
		//System.out.println(b);
		break;
		
		case "nov":
			b=3;
		//System.out.println(b);
		break;
		
		case "dec":
			b=5;
		//System.out.println(b);
		break;
		
		default:
		System.out.println("Entered Wrong Month");
		break;
		}
		}
		public int publishMonth()
		{
			System.out.println("The value of month is " + b);
			return b;
		}
		
	}

