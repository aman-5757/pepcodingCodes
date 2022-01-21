class Solution {
    public void swap(int i, int j, int [][] arr){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public void transpose(int [][] arr){
        int n = arr.length;
        
       for(int i = 0; i<n; i++ ){
           for(int j = i ; j<n; j++){
               swap(i,j, arr);
           }
       } 
    }
    
    public void reverse(int [] oneD){
        int i = 0;
        int j = oneD.length-1;
        while(i<j){
            int t = oneD[i];
            oneD[i] = oneD[j];
            oneD[j] = t;
            i++;
            j--;
        }
    }
    
    
    public void reverseRow(int [][] arr){
        //for every row we will reverse all elements
        for(int [] row : arr){
            reverse(row);
        }
        
    }
   
    public void rotate(int[][] arr) {
        transpose(arr);
        reverseRow(arr);
    }
}