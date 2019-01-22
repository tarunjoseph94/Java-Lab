class Q {   
    static int n=0;  
    boolean valueSet = false; 
 
  synchronized int get() {    
     //while valueSet is false wait
      while(!valueSet)      
        try {        
            wait();      
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");  
                } 
 
    System.out.println("Got: " + n);     
    valueSet = false;     
    notify(); 
    return n;
  } 
 
  synchronized void put() {
       //while valueSet is true wait
        while(valueSet)      
        try {        
            wait();     
            } 
            catch(InterruptedException e) 
            {         
                System.out.println("InterruptedException caught");     
            } 
        n++;
           
      valueSet = true;      
      System.out.println("Put: " + n);       
      notify();  
      } 
} 
 
class Producer extends Thread {   
    Q q;
    int i=0;
    Producer (Q y)
    {
        q=y;
    }
    public void run()
    {
        while(i<=100)
        {
        q.put();
        i++;
        }
        
    }
}
 class Consumer extends Thread {   
    Q q;
    int i=0;
    Consumer (Q y)
    {
        q=y;
    }
    public void run()
    {
        while(i<=100)
        {
        q.get();
        i++;
        }
        
    }
 }
   public class MainClass
    {
        public static void main(String[] args)
        {
            Q y=new Q();
            Producer p1=new Producer(y);
            Consumer c1=new Consumer(y);
            p1.start();
            c1.start();
        }
    }
 
