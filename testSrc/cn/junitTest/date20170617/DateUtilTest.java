package cn.junitTest.date20170617;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateUtilTest {
	
	@Before
	public void setUp(){
		System.out.println("begin");
	}
	
	@After
	public void tearDown(){
		System.out.println("over");
	}
	@Test
	public void testIsLeapYear_Before(){
		boolean leapYear = DateUtil.isLeapYear(-2);
		Assert.assertEquals(false, leapYear);
	}
	
	
	@Test
	public void testIsLeapYear_there(){
		boolean leapYear = DateUtil.isLeapYear(2008);
		Assert.assertEquals(true, leapYear);
	}
	@Test
	public void testIsLeapYear_thereNot(){
		boolean leapYear = DateUtil.isLeapYear(2017);
		Assert.assertEquals(false, leapYear);
	}
	@Test
	public void testGetDayofYear(){
		Date date = new Date(2007,8,8);
		int dayofYear = DateUtil.getDayofYear(date);
		
		Assert.assertEquals(220, dayofYear);
		
	}
	@Test
	public void testGetDayofYear_No(){
		Date date = new Date(2008,8,8);
		int dayofYear = DateUtil.getDayofYear(date);
		
		Assert.assertEquals(221, dayofYear);
	}

	
}
