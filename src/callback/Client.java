package callback;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Client {

    public static BaseInterface mBaseInterface;

//    public void myGirlLook()
//    {
//    	for(int i=0;i<5;i++)
//    	{
//    		System.out.println("可爱的妹子看了["+i+"]次纸条");
//    	}
//    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		mBaseInterface=new MyGiril();
		mBaseInterface.playPhone("妹子对我说"+"Yes, I do");
		
	}

}
