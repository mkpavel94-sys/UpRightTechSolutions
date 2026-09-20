package methodReturn;

public class ReturnDemo {

    String name; //Declaring  a variables
    public String printName(){

        name = "rony";
        //System.out.println(name);
        int age = 25;
        //System.out.println(age);
        return "rony khan";

    }



    public static void main(String[]arg){


        ReturnDemo obj = new ReturnDemo();
        System.out.println(obj.printName());


    }








}
