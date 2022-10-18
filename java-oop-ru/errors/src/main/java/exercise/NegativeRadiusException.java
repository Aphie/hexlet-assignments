package exercise;

// BEGIN
public class NegativeRadiusException extends Exception{
    public String message;

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
// END
