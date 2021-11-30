import java.util.*;
public class l001{
    // infi - 1e8
    // math.min - max -- if else

    //span
    // {
    //     int max = -(int)1e9;
    //     int min = (int)1e9;

    //     for(int i = 0; i<n; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //         if(arr[i] < min){
    //             min = arr[i];
    //         }
    //     }

    //     System.out.println(max-min);
    // }


    //bar chart

    public static int maximum(int [] arr){
        int max = -(int)1e9;
        for(int i = 0; i<arr.length; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void barChart(int [] arr){
        int height = maximum(arr);
        
        for(int h = height ; h>=1 ; h--){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] >= h){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }




    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        } 
        barChart(arr);

        
    }
}