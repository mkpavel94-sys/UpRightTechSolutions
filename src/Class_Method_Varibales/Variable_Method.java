package Class_Method_Varibales;

public class Variable_Method {


	/*


	variables has 3 parts
	1. Declaring a variables
	2. defining a variables
	3. using variables



	There are two types of variables

	1. Instance variables/ global variables ( any variable i declare inside the class not the
	                                          method it's called global variables)
	                       global variable born inside the class but i can use anywhere i want.

	2. Local variables (any variable i declare inside the method [could be main method or custom method]
	                    it is called local variable.)
	                   local variable born and die inside the method

    3. Parameter variables (

	*/




    public void method1() {              //custom method
        int zipcode = 75063;
        System.out.println("method1");
    }

    //difference between Main Method and Custom Method : Main Method can be execute(perform).


    public static void main(String[]args){     //Main method

        String name1 = "rony"; // declare and define
        String name; //declare
        name= "rony"; //define
        System.out.println(name); //use


        //inside the main method we can call method = custom method name    Method1();






    }

}
