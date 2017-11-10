/*@Creator = Pradeep Kumar
 * Last Updated = 11/1/14
 */

public class Magpie2
{
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		statement = statement.toLowerCase();
		statement = statement.trim();
		String response = "";
		if(statement.length() ==0){
			response = "ERROR 504  ENTER SOMETHING";
		}
			
		else{
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("broth;er") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if(statement.indexOf("dog") >= 0 
				|| statement.indexOf("cat") >= 0){
			
			response = "Tell me about your pet!";
		}
		else if(statement.indexOf("Yes") >= 0){
			response = "Intresting..... tell me more";
		}
		else if(statement.indexOf("hi")>=0 || statement.indexOf("hello")>=0 || statement.indexOf("hola")>=0 ){
			response = "Hello";
		}
		else if(statement.indexOf("buhot") >= 0){
			
			response = "Buhot should allow bounce";
		}
		else if(statement.indexOf("cannot")>=0){
			response = "What cant you do?";
		}
		else if(statement.indexOf("bounce")>=0){
			response = "Bounce is banned as per ruling by Mr.Buhot";
		}
		else if(statement.indexOf("haha")>=0 || statement.indexOf("funny")>=0){
			response = "Whats so funny";
		}
		else if(statement.indexOf("song")>=0 || statement.indexOf("music")>=0){
			response = "Whats your favorate song? My favorate song is Empire State of Mind";
		}
		else if(statement.indexOf("stupid")>=0 || statement.indexOf("dumb")>=0 || statement.indexOf("babe")>=0 || statement.indexOf("girl")>=0){
			response = "DO YOU WANT TO FIGHT? LETS GO SON!";
		}
		else if(statement.indexOf("ok")>=0 || statement.indexOf("alright")>=0 || statement.indexOf("fine")>=0 || statement.indexOf("yes")>=0){
			response = "Ok, what else do you want to talk about";
		}
		else if(statement.indexOf("how")>=0 || statement.indexOf("you")>=0) {
			response = "Im Fine, how are you?";
		}
		
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		}
		return response;
		
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interessant, sagen Sie mir mehr";
		}
		else if (whichResponse == 1)
		{
			response = "STOP SPROUTING RANDOM GUBERISH";
		}
		else if (whichResponse == 2)
		{
			response = "Start talking in english please.";
		}
		else if (whichResponse == 3)
		{
			response = "Ich kann nicht verstehen, bitte komm wieder";
		}
		else if(whichResponse == 4){
			response = "BLAH BLAH BLAH";
		}
		else if(whichResponse == 5){
			response = "Self Destructing in 5....4....3.....2....1........";
		}
		
		
		return response;
	}
}
