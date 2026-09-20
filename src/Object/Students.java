package Object;

public class Students {
    // Instance variable/global variable or object variable.
    String name;
    String location;
    int age;
    char gender;
    boolean isStudent;
    String schoolName;


    public void watchingReels() {
        System.out.println("love watching reels instead of study");
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Students obj = new Students();   //obj is a reference variable. obj represent the class.

        obj.name = "rony";
        obj.location = "Texas";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent  = true;
        obj.schoolName = "uts";
        obj.watchingReels();





        Students obj1 = new Students();

        obj1.name = "john";
        obj1.location = "NY";
        obj1.age = 23;
        obj1.gender = 'M';
        obj1.isStudent  = true;
        obj1.schoolName = "uts";
        obj1.watchingReels();




        Students obj2 = new Students();

        obj2.name = "Aunik";
        obj2.location = "FL";
        obj2.age =29;
        obj2.gender = 'M';
        obj2.isStudent  = true;
        obj2.schoolName = "uts";
        obj2.watchingReels();






    }

}
