public class stringDemo{
    public static void main(String [] args){
        //concatenation

        String s = "hello";
        String r = "world";
        
        s +=   r;
        System.out.println(s);
        

        //charAt
        char ch = s.charAt(4);
        System.out.println("Character -- " + ch);

        //length()
        System.out.println("Length is  -- " + s.length());

        //substring()
        //s --> helloworld
        //substring -- 1 para
        String str = s.substring(2);
        System.out.println(str);
        System.out.println(s.substring(2,6));

    }
}