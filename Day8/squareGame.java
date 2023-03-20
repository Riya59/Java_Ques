import java.util.*;
public class squareGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
   
        int res = 0;
        for(int i=0;i<n;i++){
            res = arr[i] * arr[i];
            arr[i] = res;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
