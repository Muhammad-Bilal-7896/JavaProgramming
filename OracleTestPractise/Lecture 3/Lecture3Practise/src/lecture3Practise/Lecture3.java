/**
 * 
 */
package lecture3Practise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author bilal
 *
 */
public class Lecture3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)
//        String a = "Hello";
//        String b=a;
//        System.out.println(b);
		// 2)
//		char[] text = {'H','e','l','l','o'};
//		String a = new String(text);
//		String b = new String("Hello");
//		String c = a.intern();
//		String d = b.intern();
//		if(a==b)
//		{
//			System.out.println("The string is equal");
//		}
//		else
//		{
//			System.out.println("The string is not equal"+b);
//		}
//		String a = " Hello ";
//	    a = a.trim();
//		String b = a.concat("World");
//		String c = a+ "World";
//		String d = c.toLowerCase();
//		boolean e = d.contains("W");
//		System.out.println(e);
		
		////////String Artihmetic/////////////
//		String s = "";
//		s=1+1+"u";
//		System.out.println(s);
//		s="u"+1+1;
//		System.out.println(s);
//		s="u"+(1+1);
//		System.out.println(s);
//		----------------String Indexing----------------
//		String a = "HelloWorld";
//		String b = a.substring(0,5);
//		System.out.println("b==> "+ b);
//		int c = a.indexOf('o');
//		System.out.println("c==> "+ c);
//		int d = a.indexOf('o',5);
//		System.out.println("d==> "+ d);
//		int e = a.lastIndexOf('l');
//		System.out.println("e==> "+ e);
//		int f = a.lastIndexOf('a');
//		System.out.println("f==> "+ f);
//		char g = a.charAt(0);
//		System.out.println("g==> "+ g);
//		int h = a.length();
//		System.out.println("h==> "+ h);
//		char i = a.charAt(10); //error here
//		System.out.println("i==> "+ i); //error here
		//////////String builder/////////////////
		
//		StringBuilder a = new StringBuilder();
//		a.append("tea");
//		a.append("s");
//		a.insert(3, 'm');
//		a.delete(2,4);
//		a.reverse();
//		int length = a.length();
//		int capacity = a.capacity();
//		a.insert(4,'t');
//		System.out.println("capacity==> "+ capacity);
		
//		StringBuilder stringbuilder;
//		stringbuilder = new StringBuilder(100);
//		int capacity = stringbuilder.capacity();
//		System.out.println("stringbuilder==> "+ capacity);
		
/////////////Wrapper Classes for Primitives///////////
//		int a = 42;
//		Integer b = Integer.valueOf(a); //42
//		int c = b.intValue(); //42
//		
//		b=a; //42 
//		c=b; //42
//		String d = "12.25"; 
//		Float e = Float.valueOf(d);
//		float f = Float.parseFloat(d); //12.25 in flaot as it is converted
//		String g = String.valueOf(a);
//		System.out.println(b); //42
//		System.out.println(c); //42
//		System.out.println(d); //12.25 in flaot as it is converted
//		System.out.println(e); // 12.25 
//		//i.e f = e they both are same
//		System.out.println(g); //42 in string
/////////////Wrapper Classes for Primitives///////////
		
////////////////////////Representing Numbers Using BigDecimal Class//////////////////////
//Add the class java.math.BigDecimal
//		BigDecimal price = BigDecimal.valueOf(12.99);
//		BigDecimal taxRate = BigDecimal.valueOf(0.2);
//		BigDecimal tax = price.multiply(taxRate);
//		System.out.println(tax);
//		price = price.setScale(1,RoundingMode.HALF_UP);
//		System.out.println(price);
		
		//////////////Method Chaining///////////////////
//		String s1="Hello";
//		String s2= s1.concat("World").substring(3,6);
//		System.out.println(s2); // loW
//		
//		BigDecimal price = BigDecimal.valueOf(12.99);
//		BigDecimal taxRate = BigDecimal.valueOf(0.2);
//		BigDecimal tax = price .multiply(taxRate);
//		System.out.println(tax); //tax is 2.598
//		price=price.add(tax).setScale(2,RoundingMode.HALF_UP); // price is 15.59
//		System.out.println(price); //tax is 2.598
		
		///////////LOCAL DATE AND TIME////////////////
//		LocalDate today = LocalDate.now();
//		System.out.println(today); //current date
//		LocalDate someDay = LocalDate.of(2019, Month.JANUARY, 12);
//		System.out.println(someDay); //2019-01-12
//	
//		LocalTime someTime = LocalTime.of(10,6);
//		System.out.println(someTime); //10:06
//		
//		LocalDateTime otherDateTime = LocalDateTime.of(2019, Month.MARCH,31,23,59);
//		System.out.println(otherDateTime); // 2019-03-31T23:59
//		
//		LocalDateTime someDateTime = someDay.atTime(4,8);
//		System.out.println(someDateTime); // 2019-01-12T10:06
//		
//		LocalDate whatWasTheDate = someDateTime.toLocalDate();	
//		System.out.println(whatWasTheDate); // 2019-01-12
		
/////////////////////////Instants, Durations, and Periods////////////////////
		
//		LocalDate today = LocalDate.now();
//		System.out.println(today); //2021-04-25
//		
//		LocalDate foolsDay = LocalDate.of(2019, Month.APRIL,1);
//		System.out.println(foolsDay); //2019-04-01
//				
//		Instant timeStamp = Instant.now();
//		System.out.println(timeStamp); //2021-04-25T14:25:12.216975600Z
//		
//		int nanoSecondsFromLastSecond = timeStamp.getNano();
//		System.out.println(nanoSecondsFromLastSecond); //216975600
//		
//		Period howLong = Period.between(foolsDay, today);
//		System.out.println(howLong); //P2Y24D
//		
//		Duration twoHours = Duration.ofHours(2);
//		System.out.println(twoHours); //PT2H
//		
//		long seconds = twoHours.minusMinutes(15).getSeconds();
//		System.out.println(seconds); //6300
//		
//		int days = howLong.getDays();
//		System.out.println(days); //24
		
		///////////////////Zoned Date and Time///////////////
		ZoneId london = ZoneId.of("Europe/London");
		System.out.println(london); 
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		System.out.println(la); 
		
		LocalDateTime someTime = LocalDateTime.of(2019, Month.AUGUST,1,07,14);
		System.out.println(someTime);
		
		ZonedDateTime londonTime = ZonedDateTime.of(someTime, london);
		System.out.println(londonTime);
		ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
		System.out.println(laTime);
	}
}
