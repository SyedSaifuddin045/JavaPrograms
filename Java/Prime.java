import java.util.Scanner;

class Prime{
    public static void main(String[] args) 
    {
    try (Scanner scanner = new Scanner(System.in)) 
    {
        System.out.println("Enter Number to check");
        int num = scanner.nextInt();
        boolean f=false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                f=true;
                break;
            }
        }
        if(f==true)
        {
        System.out.println("This is not a prime number.");
        }
        else{System.out.println("The Number is prime.");}
    }
    }

}