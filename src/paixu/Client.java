package paixu;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
     Employee employee=new Employee();
     employee.setCallBack(new Boss());
     employee.doSome();
	}

}
