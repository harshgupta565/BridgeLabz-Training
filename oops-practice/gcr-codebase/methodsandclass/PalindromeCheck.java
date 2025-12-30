package methodsandclass;
class PalindromeCheck{
    String text = "A man a plan a canal Panama";

    void check() {
        String s = text.replaceAll(" ", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }

    public static void main(String[] args) {
        new PalindromeCheck().check();
    }
}
