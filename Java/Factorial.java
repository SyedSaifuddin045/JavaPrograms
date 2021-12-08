import java.util.Scanner;
public class Factorial
{
    public int nonrecursion(int n)
    {
        int total=1;
        for(int i=1;i<=n;i++)
        {
            total=total*i;
        }
        return total;
    }
    public int recursion(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            return (n*recursion(n-1));
        }
    }
    public static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }
    public static void main(String[] args) 
    {
        int num,nonrecursive,recursive;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number to find Factorial");
            num=sc.nextInt();
        }
        Factorial f=new Factorial();
        nonrecursive= f.nonrecursion(num);
        recursive=f.recursion(num);
        System.out.println("Factorial through nonrecursive is ="+nonrecursive);
        System.out.println("Factorial through recursive is ="+recursive);
    }
}
