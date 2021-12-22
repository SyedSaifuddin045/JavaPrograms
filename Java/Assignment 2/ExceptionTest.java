import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String Message) {
        super(Message);
    }

    public CustomException(Throwable Cause) {
        super(Cause);
    }

    public CustomException(String Message, Throwable Cause) {
        super(Message, Cause);
    }
}

class ExceptionTest {
    public static void main(String[] args) throws CustomException {
        String a;
        int i;
        char c;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number as String");
            a = sc.nextLine();
        }

        try {
            i = Integer.parseInt(a);
        } catch (Exception UnexpectedString) {
            throw new CustomException("Cannot Convert String to Int", UnexpectedString);
        } finally {
            c = a.charAt(0);
            i = (int) c;
            System.out.println("Ascii Value for i = " + i);
        }
    }
}