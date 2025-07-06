import java.util.Comparator;
import java.util.List;

public class StringSortLength {

    public static void main(String[] args) {

        List<String> strList=List.of("sdc","okgt","uyrtf","pfo","dgft");

        //strList.stream().sorted(Comparator.comparing(String::length)).forEach(ele->System.out.print(ele+" ,"));

        strList.stream().filter(ele->ele.length()>3).forEach(ele->System.out.print(ele+" ,"));
    }
}
