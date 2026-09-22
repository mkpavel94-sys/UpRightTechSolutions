package methodReturn;

public class PracticeMR2 {

    String name; //declare the valiable
    

    public String TeacherName(){
        name = "Bahir";
        return "Bahir Uddin";

    }

    public static void main(String[] args) {
        PracticeMR2 obj = new PracticeMR2();
        System.out.println(obj.TeacherName());
    }
}
