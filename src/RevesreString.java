public class RevesreString {

    public static void main(String[] args) {

        String str="tree";
        String str1="tree";

        System.out.println(str==str1);
        System.out.println(str.equals(str1));

        StringBuffer sbr=new StringBuffer(str);
        StringBuffer sbr1=new StringBuffer(str);
        System.out.println(sbr.equals(str));

        System.out.println(sbr.toString().equals(sbr1.toString()));

    }
}
