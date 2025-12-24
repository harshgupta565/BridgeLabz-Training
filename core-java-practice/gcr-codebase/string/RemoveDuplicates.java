package string;
public class RemoveDuplicates {

    static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("programming"));
    }
}
