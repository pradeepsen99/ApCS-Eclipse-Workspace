import javax.swing.JOptionPane;


public class WithUsingJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String username;
		double PrincipleRate;
		double Rate;
		double NumberOfYears;
		double FinalAnswer;
		double hi;
		
		username = JOptionPane.showInputDialog("Enter the User's Name");
		PrincipleRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the Principle Amount"));
		Rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the Rate"));
		Rate = Rate / 100;
		NumberOfYears = Double.parseDouble(JOptionPane.showInputDialog("Enter the Amount Years"));
		
		hi = Rate/12;
		FinalAnswer = PrincipleRate * (Math.pow((1+hi), NumberOfYears * 12));
		
		JOptionPane.showMessageDialog(null, "Thank you for choosing Mr.Evil's Bank and Trust Evil Evilson\nThe monthly payment is: $"+FinalAnswer/NumberOfYears+  "\n The total payment is: $"+FinalAnswer, null, 0);
		
		

	}

}
