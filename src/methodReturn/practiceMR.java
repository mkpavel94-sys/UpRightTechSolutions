package methodReturn;

public class practiceMR {

    int rollNumber;  // declare a variable

  public int PrintNumber(){  //custom method: instead of void i use int to get return method.

      int Number = 423;
      return 423;
  }


    public static void main(String[] args) {

      practiceMR obj = new practiceMR();  //create class name obj to call method return.

        System.out.println(obj.PrintNumber()); //to get an action or print we have to call obj inside the SOUT.


    }

}
