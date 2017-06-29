package cn.test.czk;

public class MyException extends RuntimeException{
	@Override
	public void printStackTrace() {
		System.out.println("运行出问题。可能是分母为零了");
		super.printStackTrace();
	}
	
}
