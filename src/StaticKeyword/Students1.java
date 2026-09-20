package StaticKeyword;

public class Students1 {
    String name;
    String location;
    int age;
    char gender;
    boolean isStudent;
    static String schoolName = "uts"; // school name is same to everyone, that's why we use static keyword.
    //any variable or method is common to all objects that is static.


    public void watchingReels() {
        System.out.println("love watching reels instead of study");
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Students1 obj = new Students1();   //obj is a reference variable. obj represent the class.

        obj.name = "rony";
        obj.location = "Texas";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent  = true;
        schoolName = "uts";  //school name is static that's why no error. school name doesn't belong to obj anymore.
        // school name is static now. school name belong to everyone.

        obj.watchingReels();





        Students1 obj1 = new Students1();

        obj1.name = "john";
        System.out.println(obj1.name); //if i want to print name i have to use obj1.name (we have to bring the obj reference)

        obj1.location = "NY";
        obj1.age = 23;
        obj1.gender = 'M';
        obj1.isStudent  = true;
        obj1.schoolName = "uts";
        obj1.watchingReels();




        Students1 obj2 = new Students1();

        obj2.name = "Aunik";
        obj2.location = "FL";
        obj2.age =29;
        obj2.gender = 'M';
        obj2.isStudent  = true;
        obj2.schoolName = "uts";
        obj2.watchingReels();




    }

}
