package org.com.java.Application;

import java.math.BigInteger;

public class Application {

	public static void main(String[] args) {
		String i = "1517356800000";
		BigInteger bint1 = new BigInteger(i); 
		BigInteger bint2 = new BigInteger("1000"); 
		BigInteger bint3 = new BigInteger("86400"); 
		BigInteger num = new BigInteger(bint1.divide(bint2).toString());
		double getDays = Integer.parseInt(num.divide(bint3).toString());
		double getYears = getDays / 365;
		int getYear = (int)getDays / 365;
		double Month = getYears - getYear;
		double getMonths = Month * 12;
		double getDate = (getMonths - (int)getMonths) * 30;
		System.err.println(getMonths - (int)getMonths);
	}
}
