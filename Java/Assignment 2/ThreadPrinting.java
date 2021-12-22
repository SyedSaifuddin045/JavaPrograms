public class ThreadPrinting 
{
    public static void main(String[] args) throws InterruptedException 
    {
        FirstThread t1 = new FirstThread("Aliah University");
        FirstThread t2 = new FirstThread("NewTown Campus");
        FirstThread t3 = new FirstThread("CSE Department");
        
        t1.run();
        t2.run();
        t3.run();
        
        t1.join();
        t2.join();
        t3.join();
    }
}

class FirstThread extends Thread 
{
    String Message;

    FirstThread(String Message) {
        this.Message = Message;
    }

    synchronized public void run() 
    {
        char c;
        for (int i = 0; i < Message.length(); i++) 
        {
            c = Message.charAt(i);
            System.out.print(c);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("");
    }
}