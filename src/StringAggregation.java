import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringAggregation {

    public static void main(String[] args) {

        List<String>  strList=List.of("cvb","dddre","wsa","poutr");

        strList.stream().map(String::length).forEach(System.out::print);


       long result=strList.stream().collect(Collectors.counting());
       System.out.println(result);

       System.out.println("------------------------------------------");
       List<Integer> intList=new ArrayList<>();

       for(String str:strList){
           int length=str.length();
           intList.add(length);
       }

       System.out.print(intList);
    }
}
