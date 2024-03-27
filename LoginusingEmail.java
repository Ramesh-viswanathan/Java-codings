package learnJava;

public class LoginusingEmail extends Facebooklogin {

	@Override
	public void loginFunctionality() {
		System.out.println("Login facebook using Email");

	}

	private void getEmail() {
		System.out.println("Email:Greens@123@gmail.com");
	}

	public static void main(String[] args) {
		LoginusingEmail l = new LoginusingEmail();

		l.login();
		l.loginFunctionality();
		l.getEmail();

	}

}
