public class FizzBuzz{

	public static int fizzNum = 3;
	public static int buzzNum = 5;
	public static void main(String[] args)
	{
		int maxNumber = 30;
		for(int i =0; i <= maxNumber; i++)
		{
			evaluateNumber(i);
		}
	

	}
	public static void evaluateNumber(int num)
	{
		
		String output = ((num%fizzNum>0? "" : "Fizz")+(num%buzzNum >0? "" : "Buzz"));

		System.out.println((output.isEmpty()? num : output));
		

	}
}
