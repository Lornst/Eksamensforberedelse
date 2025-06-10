import java.io.IOException;

class MyException extends Exception {
    public MyException(String message){
        super(message);
    }
    public MyException(){
    }
}

public class Exceptions {

    public static void main(String[] args) {
        try{
            throwMyException();
        } catch(MyException e){
            e.printStackTrace();
            System.out.println("Hello MyException");
        }
    }

    public static void throwMyException() throws MyException{
        throw new MyException();
    }
}
