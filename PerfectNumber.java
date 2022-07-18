import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int i;
	    int sum=1;
        for(i=2;i <= number / 2;i++) {
        	
        	if(number%i == 0)
        	{
        		sum=sum+i;
        	}
	  } 
      if(sum == number) {
    	  System.out.println("Number is Perfect Number "+number);
      }  else {
    	  System.out.println("Number is not a Perfect Number "+number);
      }
   }

}
