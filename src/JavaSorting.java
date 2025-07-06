import java.util.List;
import java.util.TreeSet;

public class JavaSorting {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,3,4,8,5,2,4,6,9,7);

        TreeSet<Integer> result=new TreeSet<>(intList);

      //  result.stream().forEach(ele->System.out.print(ele+" ,"));

        for(int i=0;i<intList.size();i++){
            for(int j=i+1;j<intList.size();j++){
                if(intList.get(i)< intList.get(j)) {
                    j=i;
                    System.out.print(j + " ");
                    break;
                }
            }
        }

    }
}
