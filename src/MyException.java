public class MyException extends Exception {
    int id;

    public MyException(int x) {
        id = x;
    }
    // comment from GitHub
    public void mssOfMyException() {
        System.err.println("My exception");
    }

}
