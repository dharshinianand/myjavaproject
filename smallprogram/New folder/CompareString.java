package introduction;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class CompareString {

	public static void main(String[] args) {
	   //BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
	   String A = "Hello";
	   String B = new String("hello");
	   if (A.equalsIgnoreCase(B))
	   {
		   System.out.println("Yes");
		 
	   }
	   else 
	   {
		   System.out.println("No");
	   }
	}

}
