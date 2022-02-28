public class Main
{
    public static int max(int...arr){
        int m = -(int)1e9;
        for(int e : arr)
            m = Math.max(m, e);
        return m;
    }
	public static void main(String[] args) {
	    int maximum = max(1,2,11,4,5, 7,8);
	    
	    
		System.out.println(maximum);
	}
}
