import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Saurabh", "Rahul");
        List<String> lengths = names.stream().sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(lengths);

       long num= names.stream().collect(Collectors.counting());
       System.out.println(num);

       String str=names.get(0);
      String first= IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
        String str1=names.get(1);
        String second=  IntStream.range(0,str.length()).mapToObj(i->str1.charAt(str1.length()-1-i)).map(String::valueOf).collect(Collectors.joining());

        List<String> results =new ArrayList<>();
        results.add(first);
        results.add(second);
        System.out.println(results);

    }
}
