package methodReturn;

public class MethodReturnDemo {


    /*
       whenever i use VOID on custom method it returns only code inside the method.
       but it doesn't return the method.

EXAMPLE :   public void printName(){
        name = "Rony";
        //System.out.println(name);
        int age = 24;
        //System.out.println(age);

    }
    public static void main(String[]args){

        MethodReturnDemo obj = new MethodReturnDemo();
        obj.printName();
    }





       Method Return can return only single data types.
       in the custom method, instead of void if i use variable like String, int, boolean
       it will get return that particular variable.

    */
    String name; //declaring a variable

    public String printName() {   //whenever i use String it will return only name.
        name = "Rony";
        //System.out.println(name);
        int age = 24;
        //System.out.println(age);
        return "Rony Khan";  // in the return statement anything i use it will print name, age or number.
                      // in the custom method i can not have return 2 data type at the same time.

    }


    public static void main(String[]args){

        MethodReturnDemo obj = new MethodReturnDemo();  /* my custom method is not static, that's why i have
                                                         create an obj for class. */
        //obj.printName(); (if i don't want to print return value i can make an obj only)
        //obj.printName(); (if i don't want to print, it will return only RONY KHAN)

        System.out.println(obj.printName()); /* with the help of classObj (MethodReturnDemo obj = new MethodReturnDemo();)
                                                i can print custom method value.

                                                if i want to print custom method return, i have to call cutome method
                                                with an obj in the SOUT.
                                                */



    }
}
