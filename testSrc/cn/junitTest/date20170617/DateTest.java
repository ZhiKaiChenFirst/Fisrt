package cn.junitTest.date20170617;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * 单元测试的强调的是路径的覆盖率是白盒测试
 */


public class DateTest {
	private Date date =null;
	@Before
	public void setUp(){
		date = new Date();
	}
	
	@After
	public void tearDown(){
		System.out.println("over");
	}
	
	@Test
	public void testIsDayValid_YNotExit(){
		boolean dayValid = date.isDayValid(-3, 12,3);
		Assert.assertEquals(false, dayValid);
	}
	
	@Test
	public void testIsDayValid_Mbefore0(){
		boolean dayValid = date.isDayValid(2017,-1,29);
		Assert.assertEquals(false, dayValid);
	}
	
	@Test
	public void testIsDayValid_MafterTwe(){
		boolean dayValid = date.isDayValid(2008,13,28);
		Assert.assertEquals(false, dayValid);
	}
	
	
	@Test
	public void testIsDayValid_DafterTOne(){
		boolean dayValid = date.isDayValid(2017,2,32);
		Assert.assertEquals(false, dayValid);
	}


	
	@Test
	public void testIsDayValid_DbeforeZero(){
		boolean dayValid = date.isDayValid(2017,1,-2);
		Assert.assertEquals(false, dayValid);
	}
	
	@Test
	public void testIsDayValid_DBelong(){
		boolean dayValid = date.isDayValid(2017,4,30);
		Assert.assertEquals(true, dayValid);
	}
	
	
	@Test
	public void testIsDayValid_DBelongTN(){
		boolean dayValid = date.isDayValid(2017,4,29);
		Assert.assertEquals(true, dayValid);
	}

}
