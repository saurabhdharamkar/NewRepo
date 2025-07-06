import java.util.List;
import java.util.stream.Collectors;

public class Lister {
    public static void main(String[] args) {



        List<String> listString=List.of("abc","bcd","cdr","nhb","car");


        List<String> result=listString.stream().filter(ele-> ele.startsWith("c")).sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
