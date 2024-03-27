package learnJava;

public class Overriding_HDFCbank extends SbiBank {

	
	
	private void fixed()
	{
		System.out.println("Fixed : 6%");
	}
	
	@Override
	public void deposit() {
		System.out.println("Deposit is : 5%");
	
	}
	
	
	
	public static void main(String[] args) {
		Overriding_HDFCbank hdfc = new Overriding_HDFCbank();
		hdfc.fixed();
		hdfc.deposit();
		hdfc.savings();
		
	}

}
