package cn.test.czk;

public class MyException extends RuntimeException{
	@Override
	public void printStackTrace() {
		System.out.println("���г����⡣�����Ƿ�ĸΪ����");
		super.printStackTrace();
	}
	
}
