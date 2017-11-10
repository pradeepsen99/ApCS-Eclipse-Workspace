
public class StringSampleAssn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sample = "Mr. Buhot is Awesome";
		String sample2 = "Computer Science is the coolest";
		//indexOf
		//Output 7
		System.out.println(sample.indexOf("o"));
		
		//indexOf
		//Output -1
		System.out.println(sample.indexOf("z"));
		
		//length
		//output 20
		System.out.println(sample.length());
		
		//charAt
		//Output "."
		int hi = sample.indexOf(".");
		System.out.println(sample.charAt(hi));
		
		//substring
		//Output "Mr. Buhot is the coolest"
		
		
		System.out.println(sample.substring(0,9)+sample2.substring(16,sample2.length()));
		//substring
		//Output "Buhot is brutal"
		System.out.println(sample.substring(4,10) + " is Brutal");
		
		//lastIndexOf
		//Output 19
		

	}

}
