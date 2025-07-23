public class StringPalandrom {

    public static void main(String[] args) {

        String str = "nayanw";
        char[] ch = str.toCharArray();
        int length = str.length();
        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse += ch[i];
        }

        if (str.equalsIgnoreCase(reverse)) {
            System.out.print(str + " is Palindrome");
        } else {
            System.out.print(str + " is not Palindrome");
        }
    }
}
