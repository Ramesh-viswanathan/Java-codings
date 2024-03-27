package learnJava;

public class ExcepHandle_throw {

	void vote(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Below 18 years are not allow for voting");
		}
		else
			{
		System.out.println("Eligible for voting");		
			}
				}

	public static void main(String[] args) {
		
		ExcepHandle_throw fs=new ExcepHandle_throw();
		fs.vote(17);
	}
	
	}
	
	