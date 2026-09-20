package JavaDataTypes;

public class DataTypes {


    //to execute the command we use main method
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // Variable hold data types (int, float, boolean, long, byte, short, double, char, String)

        // There are two types of data types.


        /* PRIMITIVE = Simple value stored directly in memory (stack)
         * NON-PRIMITIVE or Reference = memory address (stack) that points to the (heep)
         *
         *
         *  PRIMITIVE      VS      REFERENCE
         *
         *  ----------             ----------
         *
         *  INT                    string (entire word "potato")
         *  DOUBLE                 array
         *  CHAR                   object
         *
         *  BOOLEAN (Conditional statement)
         *
         *
         *  There is two steps to creating a variable
         *
         *      1. declaration
         *      2. assignment
         *
         *
         *
         *
         *
         *  */


        int age = 21;
        int year = 2026;


        System.out.println(age);
        System.out.println(year);

        System.out.println("The year is " + year);
        System.out.println("john is " + age+" years old.");


        double price = 19.23;
        double gpa = 3.5;
        double temparature = -12.5;

        System.out.println("$" + price);


        char grade  = 'A';  // charecter stores single charecter/letter.
        char symble = '.';
        char currency = '$';

        System.out.println(grade);
        System.out.println(currency);
        System.out.println("Rich got gpa " + gpa + ", as a grade " + grade + symble+ "I bought a cake for rich. Which price is "+ price+ symble);


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = false;



        System.out.println(isStudent);
        System.out.println("John is a college student = " + isStudent+ symble);

        //reference data type
        // non- premitive data types


        String name = "Rony"; //String is a data type + a class too
        String food = "pizza";
        String email = "fake123@gmail.com";


        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println("Your EMAIL is " + email);

        System.out.println(name + " love " + food + "." );


        //TRUE or FALSE (boolean) condition.



        // byte stores whole number from -128 to 127


        byte age2 = 127;
        byte temperature = -35;


        System.out.println("today temperature is" +" "+temperature);


        //short stores whole number from -32768 to 32767

        short rollnumber = 32767;

        // short employeeID = 32768; // error because exceeds limit 32767.


        //	float -- stores fractional number. sufficient for storing 6 to 7 decimal digits.

        float cgpa = 3.65f;

        // double --- stores fractional numbers. sufficient for storing 15 to 16 decimal digits.

        double points = 3.666666666666666;






    }
}
