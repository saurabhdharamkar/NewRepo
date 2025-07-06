class AgeCalculator extends Exception{

    public AgeCalculator(String message){
        super(message);
    }
}


public class CustomException1{

    public static void main(String[] args) {

        try{
            validateAge(16);
            validateAge(49);
            validateAge(66);

        }catch (AgeCalculator age){
            System.out.println(age.getMessage());
        }

    }


    public static void validateAge(int age) throws AgeCalculator {

        if(age<18){
            throw new AgeCalculator("age should not be less than 18");
        }else if(age>65){
            throw new AgeCalculator("age should not be greater than 65");
        }else{
            System.out.println("Valid Age");
        }
    }
}
