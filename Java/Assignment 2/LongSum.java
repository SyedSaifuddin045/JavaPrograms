import java.math.BigInteger;
import java.util.Scanner;

public class LongSum {
    public static void main(String[] args) throws CustomException {
        String a,b;
        int num1,num2,sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers to add");
            a=sc.nextLine();
            b=sc.nextLine();
        }
        try {
            num1=Integer.parseInt(a);
            num2=Integer.parseInt(b);
            sum=num1+num2;
            System.out.println("Sum of numbers is = "+sum);
        }
        catch(Exception NumberToolong){
            throw new CustomException("Exception Occured , numbers too long",NumberToolong);
        }
        finally{
            BigInteger b1=new BigInteger(a);
            BigInteger b2=new BigInteger(b);

            BigInteger Bsum=b1.add(b2);

            System.out.println("Sum of numbers is = "+Bsum);
        }
    }
    
}
