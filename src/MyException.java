public class MyException extends Exception {
    int id;

    public MyException(int x) {
        id = x;
    }

    public void mssOfMyException() {
        System.err.println("My exception");
    }

}
