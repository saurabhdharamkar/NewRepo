public class RemoveElememt {

    public static void main(String[] args) {

        String str="Saurabh";

        String str1=str.substring(1,7);
        str1= str1+ str.charAt(0);

        System.out.println(str1.equals(str));
    }
}
