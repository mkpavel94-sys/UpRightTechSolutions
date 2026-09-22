package ParameterDemo;

import java.sql.SQLOutput;



  //A Java parameter is just a variable inside a method that waits for a value — and that value comes from the method call.


  /*

  STRUCTURE OF JAVA METHOD

  1) Access Modifier : public, private, protected
  2) Return type : void, int, String
  3) Method Name : Method1, Method2
  4) Parameters : int age, String name
  5) Method body : code block, statement

  */



public class parameter {

    public void add(){

        int a = 20;
        int b = 9;

        System.out.println(a+b);


    }

public static void main (String[]arg){

        parameter obj = new parameter();
        obj.add();


     }

}
