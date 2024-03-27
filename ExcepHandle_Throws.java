package learnJava;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

public class ExcepHandle_Throws {

	void numcheck(int num) throws IOException, ClassNotFoundException, NoSuchElementException {
		if (num == 1) {
			throw new IOException("This is IO Exception");
		} else {
			throw new ClassNotFoundException("This is class not found Exception");
		}
	}

	public static void main(String[] args) {

		ExcepHandle_Throws fs = new ExcepHandle_Throws();

		try {
			fs.numcheck(2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
