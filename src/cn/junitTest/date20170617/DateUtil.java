package cn.junitTest.date20170617;

public class DateUtil {
	public DateUtil() {
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		if (year % 100 == 0 && year % 400 != 0)
			return false;
		if (year % 100 == 0 && year % 400 == 0)
			return true;
		return false;
	}

	public static int getDayofYear(Date date) {
		int sum = 0;
		int[] a ={0,31,60,91,121,152,182,213,244,274,305,335};
		int[] b= {0,31,59,90,120,151,181,212,243,273,304,334};
		if(isLeapYear(date.getYear())){
			System.out.println(date.getMonth());
			sum=a[date.getMonth()-1];
		}else{
			sum=b[date.getMonth()-1];
		}
		sum = sum + date.getDay();
		return sum;
	}
}