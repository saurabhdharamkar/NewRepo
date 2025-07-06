import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindStart {

    public static void main(String[] args) {

        List<Integer> intList=List.of(13,52,17,1968,165,57,90,52);

        List<Integer> result=intList.stream().filter(num->num.toString().startsWith("1")).collect(Collectors.toList());

        System.out.println(result);

        List<Integer>distinctList= intList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        List<Integer> ascending=intList.stream().sorted().collect(Collectors.toList());
        System.out.println(ascending);

       List<Integer> dupElement= intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).collect(Collectors.toList());
       System.out.println(dupElement);

       List<String> list=new ArrayList<>();
       for(int i=1;i<=100;i++){
           if(i%3==0 && i%5==0){
               list.add("Ping Pong");
           }else if(i%3==0){
               list.add("Ping");
           }else if(i%5==0){
               list.add("Pong");
           }
           else{
               list.add(String.valueOf(i));
           }
       }
       System.out.println(list);
    }
}
