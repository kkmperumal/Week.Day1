package week1.day1;

public class Week1AssignmentPrimeNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean flag = false;
		int i;

		for (i = 2; i <= number / 2; i++) {
			if (number / 2 == 0) {
				flag = true;
				break;
			}
		}

		if (flag == false)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is NonPrime");

	}

}
