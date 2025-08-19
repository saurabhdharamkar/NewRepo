import java.util.LinkedHashSet;
import java.util.Set;

public class StringDup4 {

    public static void main(String[] args) {

        String str="SaurabhS";
        int length=str.length();
        char [] ch=str.toCharArray();

        Set<Character> seen=new LinkedHashSet<>();
        Set<Character> duplicate=new LinkedHashSet<>();

        for(Character c:ch){
            if(!seen.add(c)){
                duplicate.add(c);
            }
        }

        System.out.print(duplicate);
    }
}
