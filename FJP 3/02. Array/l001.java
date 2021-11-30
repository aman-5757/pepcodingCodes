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

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            swap(arr, i, j);        
            i++;
            j--;
        }
    }




    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        } 
        // barChart(arr);
        reverse(arr);
        display(arr);


        
    }
}