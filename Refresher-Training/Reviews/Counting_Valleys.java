package Reviews;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;

class Resultss {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int  valley = 0;
        for(char c : path.toCharArray()){
            if(c == 'U'){
                level++;
            }else{
                level --;
            }
            if(level == 0 && c== 'U'){
                valley++;
            }
        }
        return valley;
    }
}
public class Counting_Valleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Resultss.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
