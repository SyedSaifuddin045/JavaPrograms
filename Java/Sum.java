import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter two Numbers");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        System.out.println("The sum is = "+(a+b));

    }
}
