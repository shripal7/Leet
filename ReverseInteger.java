package aleeta;

/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
The input is assumed to be a 32-bit signed integer. 
Your function should return 0 when the reversed integer overflows
 * */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReverseInteger().reverse(113));
	}
	
public int reverse(double x) {
	System.out.println(x);
	if((int)x >= (2* Integer.MAX_VALUE)) {
		System.out.println((Integer.MAX_VALUE));
		return 0;
	}
	System.out.println(x);
     int ab = (int)(x);
     int y = 0;
     while(ab!=0)
    	 {
    		 y = (y*10) + ab%10;
    		 ab = ab/10;
    		 
    	 }
     return y;
     }
};