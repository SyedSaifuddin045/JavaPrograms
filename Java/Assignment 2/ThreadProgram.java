import java.util.Scanner;

public class ThreadProgram extends Thread {
    public void Print() {
        System.out.println("Name of thread = " + this.getName());
        System.out.println("Priority of thread is = " + this.getPriority());
    }

    public void HighestandLowestpriority() {
        System.out.println("Maximum priority of a thread is = " + Thread.MAX_PRIORITY);
        System.out.println("Minimum priority of a thread is = " + Thread.MIN_PRIORITY);
    }

    public void Change(String Name, int priority) {
        this.setName(Name);
        this.setPriority(priority);
        this.Print();
    }

    public static void main(String[] args) {
        char c;
        String name;
        int priority, f = 0;
        ThreadProgram tp = new ThreadProgram();
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println(
                        "Enter 1 for Printing Thread name and priority \n Enter 2 to set priority and name of thread \n 3 to print Maximum and Minimum priority of thread \n and 4 to exit thread");
                c = sc.next().charAt(0);
                switch (c) {
                    case '1':
                        tp.Print();
                        break;
                    case '2':
                        System.out.println("Enter new Priority for thread");
                        priority = sc.nextInt();
                        System.out.println("Enter new Name for thread");
                        name = sc.next();
                        tp.Change(name, priority);
                        break;
                    case '3':
                        tp.HighestandLowestpriority();
                        break;
                    default:
                        f = 1;
                        break;
                }
            } while (f != 1);
        }
    }
}
