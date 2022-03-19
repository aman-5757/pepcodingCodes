import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }
    
    public static void findCelebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i<n; i++){
            st.push(i);
        }
        
        while(st.size() >= 2){
            int j = st.pop();
            int i = st.pop();
            
            if(arr[i][j] == 1){
                //i can't be a celeb.
                st.push(j);
            }
            else{
                // j can't be a celeb.
                st.push(i);
            }
            
        }
        
        int pc = st.pop();
        boolean ans = true;
        //col check
        // for(int i = 0; i<n; i++){
        //     if(pc != i && arr[i][pc] == 0){
        //         ans = false;
        //         break;
        //     }
        // }
        
        // //row check
        //  for(int i = 0; i<n; i++){
        //     if(pc != i && arr[pc][i] == 1){
        //         ans = false;
        //         break;
        //     }
        // }
        
        for(int i = 0; i<n; i++){
            if(pc != i && (arr[pc][i] == 1 || arr[i][pc] == 0)){
                ans = false;
                break;
            }
        }
        
        if(ans)
            System.out.println(pc);
        else
            System.out.println("none");
        
        
        
    }

}