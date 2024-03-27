package learnJava;

public class Throw_Throws {

	void voter(int age) {
		System.out.println("hello");
	
		if (age < 18) {
			throw new ArithmeticException("You are not eligible for voting");
		} else {
			System.out.println("You are eligible for voting");
		}
		
	}
	public static void main(String[] args) {
		Throw_Throws vote = new Throw_Throws();
		vote.voter(17);

	}
}
