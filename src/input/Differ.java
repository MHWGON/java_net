package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Differ {
    public static int a;
    public static char c;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("�����ַ������¡�q���˳�");
	//�����ַ�
	do{
		try {
			c=(char)br.read();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	    System.out.println(c);
	}while(c!='q');
	
	}

}
