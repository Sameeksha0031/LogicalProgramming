import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of series");
        int limit = sc.nextInt();
		int a = 0;
		int b = 1;
		int i;
		System.out.println(a+" + ");
		for(i=0;i<limit;i++) {
		  int c = a + b;
		  a = b;
		  b = c;
		  if(i == 6) {
			  
			  System.out.println(b);
		  }else {
			  
			  System.out.println(b+ " + ");
			  
		  }
		}
	}

}
