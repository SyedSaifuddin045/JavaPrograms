/**
 * ThreeThreadProgram
 */
public class ThreeThreadProgram {
    public static void main(String[] args) throws InterruptedException {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        t1.join();
        t2.join();
        t3.join();
    }
}

class ThreadOne extends Thread {
    ThreadOne() throws InterruptedException {
        for (int i = 11; i <= 15; i++) {
            System.out.println(+i);
            Thread.sleep(1000);
        }
    }
}

class ThreadTwo extends Thread {
    ThreadTwo() throws InterruptedException {
        for (int i = 16; i <= 20; i++) {
            System.out.println(+i);
            Thread.sleep(2000);
        }
    }
}

class ThreadThree extends Thread {
    ThreadThree() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(+i);
            Thread.sleep(500);
        }
    }
}