public class Add 
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(int a,double b)
    {
        return a+b;
    }
    public double add(double a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public String add(String a,String b)
    {
        return a+b;
    }
    public static void main(String[] args) 
    {
        int a=5,b=9;
        double c=2.0,d=3.6;
        String e="Hello",f="World";
        Add A=new Add();
        System.out.println("Integer + Integer = "+A.add(a,b));
        System.out.println("Integer + Double = "+A.add(a,c));
        System.out.println("Double + Integer = "+A.add(d,b)); 
        System.out.println("Double + Double = "+A.add(c,d));
        System.out.println("String + String = "+A.add(e,f)); 
    }  
}
