import java.util.Scanner;

public class VarablesDataTypesLab_WithScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		String username;
		double PrincipleRate;
		double Rate;
		double NumberOfYears;
		double FinalAnswer;
		double hi;
		
		System.out.println("Enter the User's Name");
		username = input.nextLine();
		
		System.out.println("Define the Principle Amount");
		PrincipleRate = input.nextDouble();
				
		System.out.println("Define the Rate");
		Rate = input.nextDouble();
		Rate = Rate / 100;
		
		System.out.println("Define the Number of Years ");
		NumberOfYears = input.nextDouble();
				
		hi = Rate/12;
		FinalAnswer = PrincipleRate * (Math.pow((1+hi), NumberOfYears * 12));
		
		System.out.println("Thank you for choosing Mr.Evil's Bank and Trust Evil Evilson\nThe monthly payment is: $"+PrincipleRate+  "\n The total payment is: $"+FinalAnswer);
		System.out.println(FinalAnswer);
		System.out.println(PrincipleRate);
		System.out.println(Rate);
		System.out.println(NumberOfYears);
		System.out.println(FinalAnswer);
		
		

	}

}
