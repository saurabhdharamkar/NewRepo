import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveVowels {

    public static void main(String[] args) {

        String str= "adfeiouytfrgd";

        char [] ch=str.toCharArray();
        String result="";
        List<Character> list=new LinkedList<>();
        StringBuffer sbr=new StringBuffer();

        for(int i=0;i<str.length();i++){

            if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='i' || ch[i]=='u')){
                sbr.append(ch[i]);
                list.add(ch[i]);
                result+=ch[i];
                System.out.println(result.hashCode());
            }
        }

        System.out.print(result);

    }
}
