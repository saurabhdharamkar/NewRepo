public class SecondLargest {

    public static void main(String[] args) {

        int [] arr={1,2,5,7,6,9,8,4};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        System.out.println(secondLargest);
    }
}
