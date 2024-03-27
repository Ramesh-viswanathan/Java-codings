package learnJava;

public class palindrom {

	public static void main(String[] args) {

		        int number = 121;

		        int reverse;

		        int temp;

		        int sum = 0;

		        temp = number;

		       
		        while(number>0) {

		            reverse = number%10;

		            sum = (sum *10)+ reverse;

		            number = number/10;

		        }

		       
		        if (temp == sum) {
		        	System.out.println("not palindrom");
		       	        }

		        else {

		            System.out.println("palindrom");

		        }

		    }
	}

