import java.util.Scanner;

public class Complex {
    int real,imaginary;
    public Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex Addition(Complex c1,Complex c2)
    {
        Complex c3 = new Complex(0,0);
        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
        return c3;
    }
    public Complex Subtraction(Complex c1,Complex c2)
    {
        Complex c3=new Complex(0,0);
        c3.real=c1.real-c2.real;
        c3.imaginary=c1.imaginary-c2.imaginary;
        return c3;
    }
    public Complex Multiplication(Complex c1,Complex c2)
    {
        Complex c3=new Complex(0,0);
        c3.real=(c1.real*c2.real)-(c2.imaginary*c1.imaginary);
        c3.imaginary=(c1.real*c2.imaginary)+(c2.real*c1.imaginary);
        return c3;
    }
    public static void main(String[] args) {
        int r1,r2,i1,i2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Real and Imaginary for 1st Complex Number");
            r1=sc.nextInt();
            i1=sc.nextInt();
            System.out.println("Enter Real and Imaginary for 1st Complex Number");
            r2=sc.nextInt();
            i2=sc.nextInt();
        }
        Complex Comp1=new Complex(r1,i1);
        Complex Comp2=new Complex(r2,i2);
        Complex Comp3=new Complex(0,0);

        //Comp3=Comp3.Addition(Comp1, Comp2);
        //Comp3=Comp3.Subtraction(Comp1, Comp2);
        Comp3=Comp3.Multiplication(Comp1, Comp2);

        System.out.println("The Resultant Complex Number is = "+Comp3.real+"+"+Comp3.imaginary+"i");
    }
}
