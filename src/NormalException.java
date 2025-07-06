
class AgeException extends Exception{

    public AgeException(String msg){
        super(msg);
    }
}





public class NormalException {

    public static void main(String[] args) {

        try{
            ageCalculate(16);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program Closed");
        }

    }

    public static void ageCalculate(int age) throws AgeException {
        if(age<18){
            throw new AgeException(age+" age should not be less than 18");
        }
    }
}
