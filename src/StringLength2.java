import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength2 {

    public static void main(String[] args) {

        List<String> str= List.of("saurabh","pavan","raj","ankit");
      //  List<String> result=new ArrayList<>();

//        int minLength=str.get(0).length();
//
//        for(String  num :str){
//            int numLength=num.length();
//            if(numLength<minLength){
//                minLength=numLength;
//                result.add(num);
//            }
//
//        }
//        System.out.println(minLength+" :"+result.get(1));


        String minLength= String.valueOf(str.stream().sorted(Comparator.comparing(String::length).reversed()).map(String::valueOf).findFirst());
        System.out.println(minLength);

        List<String> result=str.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
