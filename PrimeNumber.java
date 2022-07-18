import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int number = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=number/2;i++) {
        	if(number % i == 0) {
        		flag=flag+1;
        	}
        }
	    if(flag == 0) {
	    	System.out.println(number+" is Prime  number");
	    }else {
	    	System.out.println(number+" is not Prime  number");
	    }
	}	

}
