package searching;

public class ConcatrnateStrings {
    public static void main(String[] args) {

        String[] arr = {"Java", " ", "is", " ", "awesome"};

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        String result = sb.toString();
        System.out.println(result);
    }
}

