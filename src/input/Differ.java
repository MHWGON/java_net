package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Differ {
    public static int a;
    public static char c;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("输入字符，按下‘q’退出");
	//读出字符
	do{
		try {
			c=(char)br.read();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	    System.out.println(c);
	}while(c!='q');
	
	}

}
