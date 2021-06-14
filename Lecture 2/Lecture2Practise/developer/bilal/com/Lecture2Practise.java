/**
 * 
 */
package developer.bilal.com;
/**
 * @author bilal
 *
 */
public class Lecture2Practise {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte x=2,y=3,z=5;
//		float a=(float)(x/y);
//		a=(float)x/y;
//		System.out.println("TWhich statements are true about a Class diagram?he value of x is : "+ x+"\n"+
//		"The value of y is : " + y + "\n" + "The value of Z is: "+z+"\n"
//		+ "The value of a(float) is: "+a+"\n");
		
//		PS A:\JAVA SE 11 Lectures Oracle> jshell
//		|  Welcome to JShell -- Version 11.0.10
//		|  For an introduction type: /help intro


//		byte x=2,y=3,z=5;
//		x ==> 2
//		y ==> 3
//		z ==> 5

//		double b = (double)x/y;
//		b ==> 0.6666666666666666

		//		float a =2;
//		a ==> 2.0

		//b=a;
//		b ==> 2.0

		//float a2 =x/(float)y;
//		a ==> 0.6666667

		//b=a;
//		b ==> 0.6666666865348816

		//float x1= Math.round(b*1000);
//		x ==> 667.0

		//float x2 = Math.round(b*1000);
//		x ==> 667.0

		//float x3 = Math.round(b*1000)/1000F;
//		x ==> 0.667

		//float x4 = Math.round(b*1000)/1000;
//		x ==> 0.0

		//char al = 'a' ,ah='\141',a3='\u0061';
//		al ==> 'a'
//		a2 ==> 'a'
//		a3 ==> 'a'
		//System.out.println("Result " + al + ah + a3);
		//char upperA = 'A',lowerA = 'a',someChar='h';

		//int distance = lowerA - upperA;
		//System.out.println("Distance ==> "+distance);
		//char upperSomeChar = (char)(someChar-32);
		//System.out.println("UpperSomeChar ==> " + upperSomeChar);
//		char someChar = 'W';
//		if(someChar >= 'a' && someChar <= 'z') 
//		{
//			someChar -= 32;
//		}
//		else
//		{
//			someChar += 32;
//		}
//	    System.out.println("SomeChar ==> "+someChar);
//		someChar = (someChar >= 'a' && someChar <= 'z') ? (char)(someChar-32) : (char)(someChar + 32);
//		System.out.println("SomeChar ==> "+someChar);
		int period = 4;
		float amount = 10;
		float rate = 0.05F;
		switch(period)
		{
		case 4:
			amount += amount * 0.2F;
		case 3:
			amount += amount * rate;
		case 2:
			amount += amount * rate;
		case 1:
			amount += amount * rate;
		}
		System.out.println(amount);
	}
}
