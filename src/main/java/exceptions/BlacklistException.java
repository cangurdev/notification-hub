package exceptions;

public class BlacklistException extends RuntimeException{
    public BlacklistException(String message){
        super(message);
    }
}
