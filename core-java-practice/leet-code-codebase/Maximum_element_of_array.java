
import java.util.*;
public class max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

        }
        //max elements in a array
        // [22,5,66,3,51,42,66,9]
        // max elements would be 66
        int maxvalue = 0 ;
        int max = 0;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
                maxvalue = Math.max(max,maxvalue);
            }

        }
        System.out.print(maxvalue);

        // Another way
        // 0. using array.sort and call array-1 element as an output
        // 1. using two pointer

         }

    }

