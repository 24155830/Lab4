import java.util.*;
abstract class Student{
    int roll;
    int reg;
   void get_input(){
       System.out.println("Enter roll no and registration no");
       Scanner sc=new Scanner(System.in);
       roll =sc.nextInt();
       reg=sc.nextInt();

   }
   abstract void course();
}
class kiitian extends Student {

    void course(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter course");
        String course = sc.nextLine();
        System.out.println("Roll no." + roll + "\nRegistration "+ reg+ "\n Course"+ course);
    }



}
public class q2 {
    public static void main(String[] args)
    { kiitian a= new kiitian();
        a.get_input();
        a.course();
    }
}
