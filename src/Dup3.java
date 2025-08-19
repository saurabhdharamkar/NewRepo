import java.util.List;

public class Dup3 {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,5,9,1,5,8,6,5,8,6,4,7,3,2);

        int length=intList.size();

        for(int i=0;i<length;i++){

            for(int j=i+1;j<length;j++){

                if(intList.get(i)==intList.get(j)){
                    System.out.print(intList.get(i));
                    break;
                }
            }
        }
    }
}
