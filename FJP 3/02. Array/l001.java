import java.util.*;
public class l001{
    // infi - 1e8
    // math.min - max -- if else


    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        } 

        int max = -(int)1e9;
        int min = (int)1e9;

        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(max-min);
    }
}