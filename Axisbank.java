package learnJava;

public class Axisbank implements RbiBank {

	@Override
	public void savings() {

		System.out.println("The Savings percentage is 5%");

	}

	@Override
	public void deposit() {

		System.out.println("The Deposit percentage is 7%");
	}

	@Override
	public void fixed() {

		System.out.println("The fixed percentage is 9%");
	}

	public static void main(String[] args) {
		Axisbank obj = new Axisbank();
		obj.deposit();
		obj.fixed();
		obj.savings();
	}

}
