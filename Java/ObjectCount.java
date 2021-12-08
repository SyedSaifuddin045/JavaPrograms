public class ObjectCount 
{
    static int count;
    public ObjectCount()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        int n=6;
        for(int i=0;i<n;i++)
        {
            ObjectCount ob=new ObjectCount();
        }
        System.out.println("No. of objects created = "+ObjectCount.count);
    }
}
