package Object;

public class Practice2 {
    static String storeName = "Walmart";
    String product;
    int Amount;
    double price;
    char size;
    boolean reusable;



    public static void main(String[] args) {
        // TODO Auto-generated method stub




        Practice2 obj = new Practice2();


        storeName = "Walmart";
        obj.product = "Shirt";
        obj.Amount = 1;
        obj.price = 20.00;
        obj.size = 'M';
        obj.reusable = true;




        Practice2 obj1 = new Practice2();


        storeName = "Walmart";
        obj1.product = "T-shirt";
        obj1.Amount = 3;
        obj1.price = 16.50;
        obj1.size = 's';
        obj1.reusable = true;






        Practice2 obj2 = new Practice2();


        storeName = "Walmart";
        obj2.product = "Shoes";
        obj2.Amount = 2;
        obj2.price = 34.79;
        obj2.size = 'L';
        obj2.reusable = true;


        Practice2 obj3 = new Practice2();


        storeName = "Walmart";
        obj3.product = "paper";
        obj3.Amount = 1;
        obj3.price = 4.00;
        obj3.size = 'M';
        obj3.reusable = false;




        System.out.println("Store"+" "+obj.storeName+"."+" "+"Product"+" "+obj.product+"."+" "+"Total amount"+"="+obj.Amount+"."+"Total price"+" "+obj.price+".");


    }
}
