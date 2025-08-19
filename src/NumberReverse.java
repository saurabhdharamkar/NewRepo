public class NumberReverse {

    public static void main(String[] args) {

        int num=121;
         String str=String.valueOf(num);

         int length=str.length();

         char [] ch=str.toCharArray();

         String reverse="";

         for(int i=length-1;i>=0;i--){
             reverse+=ch[i];
         }

         System.out.print(reverse);
    }
}
