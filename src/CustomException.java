




class ageException extends Exception{

    public ageException(String msg){
        super(msg);
    }
}







public class CustomException {

    public static void main(String[] args) throws ageException {

        int age=15;
        try {
            validate(15);
        } catch (ageException e) {
            throw new ageException(e.getMessage());
        }
    }

    public static void validate(int age) throws ageException {
        if(age<15){
            throw new ageException("Age is less");
        }

    }




}
