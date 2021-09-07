package week1.day1;

public class DivisibilityBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Number is divisible by 3 and 5");
		} else if (num % 3 == 0) {
			System.out.println("Number is divisible by 3");
		} else if (num % 5 == 0) {
			System.out.println("Number is divisible by 5");
		} else {
			System.out.println("Number is not divisible by 3 and 5");
		}
	}
}