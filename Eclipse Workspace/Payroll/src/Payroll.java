import java.util.Scanner; 

import javax.swing.JOptionPane;
public class Payroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		String name;
		int rate;
		int hours;
		int weeklypay;
		
		
		name = JOptionPane.showInputDialog("Enter Employee name");
		rate = Integer.parseInt(JOptionPane.showInputDialog("Enter employee name"));
		hours = Integer.parseInt(JOptionPane.showInputDialog("Enter employee Hours Worked"));		
		
		System.out.print( "Enter Emplyee Name: ");
		name = input.nextLine();
		
		System.out.print("Enetr Employee Hourly Rate");
		rate = input.nextInt();
		
		System.out.print("Enter employee Hours Worked");
		hours=  input.nextInt();
		
		
		weeklypay = rate * hours;
		
		System.out.println("Employee:   "+ name);
		System.out.println("Total Pay $" + weeklypay );

		JOptionPane.showMessageDialog(null, "Employee Weekly Pay = $" + weeklypay);
	}

}
