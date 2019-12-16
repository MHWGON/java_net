package paixu;

public class Paixu 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int[]data={36,4,66,88,99,1};
     System.out.println("≈≈–Ú«∞");
     for(int x=0;x<data.length;x++)
     {
    	 System.out.println(data[x]+",");
     }
     System.out.println("≈≈–Ú∫Û");
    	 for(int i=0;i<data.length-1;i++)
    	 {
    		 for(int j=i+1;j<data.length;j++)
    		 {
    			 if(data[i]>data[j])
    			 {
    				int temp=data[i];
    				data[i]=data[j];
    				data[j]=temp;		
    			 }
    		 
    		 }
    	 }
     for(int x=0;x<data.length;x++)
    	 System.out.println(data[x]+",");
	}

}
