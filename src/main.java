import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
            FileReader fileReader = new FileReader( "test.txt");
            Scanner scanner = new Scanner(fileReader);
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error is in our program!");
        } catch (ArithmeticException r) {
            System.err.println("Не можна ділити на 0");
        } */
        try {
            checkingErr(5);
            checkingErr(12);
        } catch (MyException e) {
            e.mssOfMyException();

        }
    }
    static void checkingErr(int a) throws MyException {
        if (a > 18)
            throw new MyException(a);
        System.out.println("No error in prog. no exception caught");
    }
}
