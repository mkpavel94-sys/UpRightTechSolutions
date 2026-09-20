package Object;

public class Practice1 {

    String Color;
    int Year;
    double Price;
    static String BrandName = "Toyota";





    public static void main(String[] args) {
        // TODO Auto-generated method stub



        Practice1 obj = new Practice1();

        obj.Color = "Black";
        obj.Year = 2024;
        obj.Price = 12350.00;
        BrandName  ="Toyota";



        Practice1 obj1 = new Practice1();

        obj1.Color = "white";
        obj1.Year = 2020;
        obj1.Price = 9550.00;
        BrandName  ="Toyota";


        Practice1 obj2 = new Practice1();

        obj2.Color = "Red";
        obj2.Year = 2025;
        obj2.Price = 17720.00;
        BrandName  ="Toyota";




        System.out.println(BrandName+" "+obj.Color+" "+"color"+","+" "+"year"+"="+obj.Year+","+" "+"Car Price is"+" "+obj.Price+"$"+".");


        System.out.println(BrandName+" "+obj1.Color+" "+"color"+","+" "+"year"+"="+obj1.Year+","+" "+"Car Price is"+" "+obj1.Price+"$"+".");


        System.out.println(BrandName+" "+obj2.Color+" "+"color"+","+" "+"year"+"="+obj2.Year+","+" "+"Car Price is"+" "+obj2.Price+"$"+".");




    }



}
