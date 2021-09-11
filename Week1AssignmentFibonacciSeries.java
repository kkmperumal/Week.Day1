package week1.day1;

public class Week1AssignmentFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int runningsum=0;
		int currentnum=1;
		int sum=0;
		for (int i = 0; i < 8; i++) {
			
			System.out.println(sum);
			sum=runningsum+currentnum;
			runningsum=currentnum;
			currentnum=sum;
		}
	}
}