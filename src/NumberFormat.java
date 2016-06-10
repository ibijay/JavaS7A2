import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		
		String a;
		int b;
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter a Number");
			a= input.next();
			b=Integer.parseInt(a);
			System.out.println("Correct Value Entered No Error Encountered");
		}	
		
		catch(NumberFormatException e){			
			System.out.println("Plese Enter Number only");
		}
		catch(Exception e){
				e.printStackTrace();
				System.out.println("Something wrong out there: "+e.getMessage());
		}

		finally{
			input.close();
		}
		
	}
	
}