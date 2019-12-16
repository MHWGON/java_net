package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//从后天中拉取数据
public class Main {
	private static InputStream iStream;
	public static void main(String[] args) {
	 
		// TODO 自动生成的方法存根
      try {
    	  //连接后台文件
		URL url=new URL("http://localhost/index2.php");
		try {
			
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		    connection.setRequestMethod("GET");
		    connection.connect();
		    //进行取数据
		    if (connection.getResponseCode()==200) {
		    	iStream=connection.getInputStream();
		       byte[] buffer=new byte[512];
		       int hasRead=-1;
		       StringBuffer sBuffer=new StringBuffer();
		       while((hasRead=iStream.read(buffer))!=-1){
		    	   sBuffer.append(new String(buffer,0,hasRead));
		       }
		       System.out.print(sBuffer.toString());
			}
		    
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
	} catch (MalformedURLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}finally {
		if(iStream!=null){
			try {
				iStream.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
      
     
	}

}
