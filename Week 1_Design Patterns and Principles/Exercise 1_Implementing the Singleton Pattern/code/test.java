class Logger
{
	private static Logger obj;
	private Logger()
	{
		System.out.println("Instance Created");
	}
	public static Logger getInstance()
	{
		if(obj==null)
		{
			synchronized(Logger.class)
			{
			if(obj==null)
				{
					obj=new Logger();
				}
	
			}
		}
		return obj;
	}
}
public class test {

	public static void main(String[] args) {
       Thread t1=new Thread(new Runnable() {
    	   public void run()
    	   {
    		  Logger obj1=Logger.getInstance(); 
    	   }
       });
    	   Thread t2=new Thread(new Runnable() {
        	   public void run()
        	   {
        		  Logger obj2=Logger.getInstance(); 
        	   }
       });
     t1.start();
     t2.start();
	}

}
