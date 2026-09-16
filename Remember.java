public class Remember{
	/* We had an issue where printing ´’´ 
	   would be incorrectly encoded. 
	 
	 * We tried enforcing UTF-8, but to no avail. 
	 
	 * Also tried \u2019, the Unicode for ´’´,
	   however even this was misencoded in powershell.
	 
	 * This issue is presumable local and thus the output
	   would likely work in a different environment, 
	   but in lieu of this, we sustituted ´’´ with ´'´.

	 * All this to say, we are aware, that two chars are incorrect 
	   and we have tried to mitigate the issue as best we can.
	 
	 * */

	
	public static String adviceLine = "Use \"\\\\\" to obtain a 'backslash' character."; 

	public static void main(String args[])
	{
	
		printLines(new String[] {adviceLine, "Remeber:", adviceLine}); // using new String[] we can easily iterate over any amount of strings and print them 
		
	}

	public static void printLines(String [] lines)
	{

		for(String line : lines) 
		{
		
			System.out.println(line);
		
		}

	}

		/* Here we use a loop commonly reffered to as a "foreach loop". 
		 * While it gives us less control, its cleaner and makes it harder to accidentally try printing too few or too many elements of the array. 
		 */


	/*
	 * Below is a version using a regular for loop instead:
	 	
	 	public static void printLines(String [] lines)
		{
			
			for(int i = 0; i < lines.length;i++ ) 
			{

				System.out.println(lines[i]);
			
			}
		
		}
	*/
	

}
