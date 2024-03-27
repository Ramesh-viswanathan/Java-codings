package learnJava;

public class ExcepHandle_try_Catch_Finally {

	public static void main(String[] args) {

		
		int a=10;
		int b=0;
		int c=0;
		try
		{
			c=a/b;
			System.out.println("The answer of c:" +c);
			int arr[]= {10,20};
				int value= arr[2];
				System.out.println(value);

		}
		catch (ArithmeticException e) {
			System.out.println("The Exception has occured");
		}
		catch(NullPointerException |ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is Null pointer Exception");
		}
		
		catch (Exception e) {
			System.out.println("The Common Exception has occured");
		}
	finally {
		System.out.println("Finally block run sucess");
		
	}
	}	
		
	}


