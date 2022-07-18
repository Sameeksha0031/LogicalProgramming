import java.util.Scanner;
public class CouponNumber {
	
    static public void computeCouponNo() {
		int min=1;
		int max=100;
		int distinctno = 5;
		int number =0;
		int[] coupon = new int[distinctno];
		boolean isRepeated;
		for(int i=0;i<distinctno;i++) {
			do {
				isRepeated = false;
			    number =(int)(Math.random()*10000) % 100;
	            for(int j=0;j<distinctno;j++) {
	               if(coupon[j] == number) {
	            	   isRepeated=true;
	            	   break;
	               }	
	            }
			}while(isRepeated);
		  coupon[i] = number;	
		}
		System.out.println("The Coupon Number is : ");
		for(int i=0;i<distinctno;i++) {
			System.out.print(coupon[i]+ " ");
		}
	} 
	public static void main(String[] args) {
	
		//CouponNumber obj = new CouponNumber();
		 computeCouponNo();
	}
}