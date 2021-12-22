abstract class Employee 
{
    long EMP_Code;
    String EMP_NAME;
    String ADDRESS;
    String PH_NO;
    double salary, basicpay,DA=10.0,HRA=20.0;

    public Employee(int bp) 
    {
        this.basicpay = bp;
    }

    public void CalculateSalary(double basicpay2, double dA2, double hRA2) {
        this.salary = basicpay2 + ((dA2 / 100.0) * basicpay2) + (hRA2 / 100.0) * basicpay2;
    }

    abstract void PrintSalary();
    public static void main(String[] args) 
    {
    new Manager(50000);
    new Typist(40000);
    new Officer(20000);
    }
}

class Manager extends Employee 
{

    Manager(int bp) {
        super(bp);
        super.CalculateSalary(this.basicpay, this.DA, this.HRA);
        PrintSalary();
    }

    @Override
    void PrintSalary() {
        System.out.println("The salary of " + this.getClass() + " is = " + this.salary);

    }
}

class Typist extends Employee 
{

    Typist(int bp) {
        super(bp);
        super.CalculateSalary(bp, this.DA, this.HRA);
        PrintSalary();
    }

    @Override
    void PrintSalary() {
        System.out.println("The salary of " + this.getClass() + " is = " + this.salary);

    }
}

class Officer extends Employee 
{
    Officer(int bp) {
        super(bp);
        super.CalculateSalary(bp, this.DA, this.HRA);
        PrintSalary();
    }

    @Override
    void PrintSalary() 
    {
        System.out.println("The salary of " + this.getClass() + " is = " + this.salary);
    }
}