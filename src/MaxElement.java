import java.util.List;

public class MaxElement {

    public static void main(String[] args) {

        List<Integer> intList=List.of(5,1,4,9,63,2,5,7,8,5);

        int max=intList.getFirst();

        for(int num:intList){
            if(max<num){
                max=num;
            }
        }
        System.out.print(max);
    }
}
