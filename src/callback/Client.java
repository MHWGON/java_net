package callback;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Client {

    public static BaseInterface mBaseInterface;

//    public void myGirlLook()
//    {
//    	for(int i=0;i<5;i++)
//    	{
//    		System.out.println("�ɰ������ӿ���["+i+"]��ֽ��");
//    	}
//    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		mBaseInterface=new MyGiril();
		mBaseInterface.playPhone("���Ӷ���˵"+"Yes, I do");
		
	}

}
