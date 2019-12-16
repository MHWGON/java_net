package paixu;

import javax.security.auth.callback.Callback;

public class Employee {

	private CallBackInterface mCallBackInterface=null;
	
	public void setCallBack(CallBackInterface callBackInterface)
	{
		//给成员变量赋值
		this.mCallBackInterface=callBackInterface;
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public void doSome()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("第["+i+"]件事情做完了");
		}
		mCallBackInterface.execute();
	}

}
