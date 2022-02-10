public class Main{

    public static class student{
        //Data
        String name = "nameTemp";
        int id = 9999;
        int batch = 10000;
        
        //contructor
        student(){

        }

        student(String name){
            this.name = name;
        }

        student(String name, int id){
            this.name = name;
            this.id = id;
        }

        student(String name, int id, int batch){
            this.name = name;
            this.id = id;
            this.batch = batch;
        }


    }

    public static void main(String [] args){
        // student aman = new student("Aman" , 5, 1);
        student aman = new student("Aman" );
        System.out.println("Name " + aman.name);
        
    }


    // public static void main(String [] args){
    //     student saksham = new student("Saksham", 7, 4);
    //     student karan = new student("Karan", 11, 4);
    //     student surjeet = new student("Surjeet", 6, 4);
    //     student cr = surjeet;
       
    //     System.out.println("Name "  + cr.name);
    //     System.out.println("ID "  + cr.id);
    //     System.out.println("Batch "  + cr.batch);

    //     // System.out.println("Name "  + karan.name);
    //     // System.out.println("ID "  + karan.id);
    //     // System.out.println("Batch "  + karan.batch);
        
    //     // System.out.println("Name "  + surjeet.name);
    //     // System.out.println("ID "  + surjeet.id);
    //     // System.out.println("Batch "  + surjeet.batch);

    // }
}