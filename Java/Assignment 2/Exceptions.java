public class Exceptions {
    public static void main(String[] args) {
        int num = 20, quotient;
        try {
            quotient = num / 0;
            System.out.println("Result = " + quotient);
        } catch (ArithmeticException dividedbyzeroException) {
            System.out.println("Exception Occured");
        } finally {
            quotient = -1;
            System.out.println("Result = " + quotient);
        }
    }
}
