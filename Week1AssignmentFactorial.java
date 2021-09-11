package week1.day1;

public class Week1AssignmentFactorial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
        long runningProduct = 1;
        int i = 1;
        while(i<=number)
        {
        	runningProduct = runningProduct * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+runningProduct);
	}

}