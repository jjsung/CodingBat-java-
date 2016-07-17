package array2;

import java.util.Arrays;

/*
 * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

fizzBuzz(1, 6)  ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 */
public class FizzBuzz {
	
	
	public static void main (String[] args)
	{
		String[] bobby= fizzBuzz(50,56);
		
		System.out.println(Arrays.toString(bobby));
		
	}
	

	public static String[] fizzBuzz(int start, int end) {
	
	int length= end-start; 
	String[] bob=new String[length];
	int startingplace= 0; 
		
	for(int i=start; i<end;i++)
	{
		
		if(i % 15 ==0)
		{
			bob[startingplace++]= "FizzBuzz";
			
		}
		
		else if(i%3 ==0)
		{
			bob[startingplace++]= "Fizz";
			
		}
			
		else if(i%5 ==0)
		{
			bob[startingplace++]= "Buzz";
			
		}
		
		else
		{
			bob[startingplace++]=String.valueOf(i);
			
		}
		
		
	}
	
	
	return bob;
	}

	
	
	
}
