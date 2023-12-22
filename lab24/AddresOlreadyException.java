package lab24;
public class AddresOlreadyException extends Exception{
    public AddresOlreadyException(String address){
        super("Already added at this address");
    }
}
