import javax.swing.JFrame;


public class SampleFormatting extends JFrame{

	
	
	public static void main(String[] args) {
		
		int ltr = 34;
		
		System.out.println(String.format("%c",0));
		System.out.println(String.format("%c", ltr));
	}

}
