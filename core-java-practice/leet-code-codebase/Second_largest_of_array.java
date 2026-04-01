
import java.util.*;
public class Second_largest_of_array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
        int minvalue = Integer.MAX_VALUE;;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
                minvalue = Math.min(min,minvalue);
            }

        }
        System.out.print(minvalue);

    }
}
