package paixu;

import javax.security.auth.callback.Callback;

public class Employee {

	private CallBackInterface mCallBackInterface=null;
	
	public void setCallBack(CallBackInterface callBackInterface)
	{
		//����Ա������ֵ
		this.mCallBackInterface=callBackInterface;
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	public void doSome()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("��["+i+"]������������");
		}
		mCallBackInterface.execute();
	}

}
