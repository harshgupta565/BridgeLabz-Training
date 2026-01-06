import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of elements ");
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ;i++) {
            arr[i] = sc.nextInt();
        }
        // calculate avg for array
        int sum = 0;
        for (int j = 0 ; j< n ;j++){
             sum += arr[j];

        }
        int avg = sum /n;
        System.out.println("Avrage " +avg);
      int max = Integer.MIN_VALUE;
      for(int i = 0 ; i <n ; i++){
            if(arr[i] >max) {
                 max = arr[i];
            }
        }
        System.out.println(" max element "+max);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <n ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min elements "+min);
        int [] arr1 = new  int [n];
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>avg){
                arr1[j] =arr[i];
                j++;}
        }
        System.out.print("Greater than average numbers: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}