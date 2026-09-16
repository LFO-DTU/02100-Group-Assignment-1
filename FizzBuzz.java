public class FizzBuzz{

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
		
		String output = ((num%3>0? "" : "Fizz")+(num%5 >0? "" : "Buzz"));

		System.out.println((output.isEmpty()? num : output));
		

	}
}
