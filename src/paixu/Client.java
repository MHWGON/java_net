package paixu;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     Employee employee=new Employee();
     employee.setCallBack(new Boss());
     employee.doSome();
	}

}
