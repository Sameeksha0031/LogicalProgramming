import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to reverse");
    int number = sc.nextInt();
    int num = number;
    int rev = 0;
    while(number != 0) {
    	
    	int i = number%10;
    	rev = rev * 10+ i ;
    	number = number/10;
    }
    
    System.out.println("Reverse from of " +num+" is "+rev );
		
	}

}
