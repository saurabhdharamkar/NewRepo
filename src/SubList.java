import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SubList {

    public static void main(String[] args) {

        List<Integer> intList=List.of(3,5,49,86,8,21,2,98,4,58,7,46);

        int length =intList.size();
        int half=length/2;

       List<Integer> ascending= intList.subList(0,half).stream().sorted().toList();
       List<Integer> descending= intList.subList(half,length).stream().sorted(Comparator.reverseOrder()).toList();
       List<Integer> record =new ArrayList<>();
       record.addAll(ascending);
       record.addAll(descending);

//       for(int num:record){
//           System.out.print(num+" ");
//       }

        record.forEach(ele->System.out.print(ele+" "));

      // System.out.print(record);

    }
}
