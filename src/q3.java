import java.util.*;

class Student2 {
    String name;
    int rollno;

    Student2(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student2 st = (Student2) obj;
        return rollno == st.rollno && Objects.equals(name, st.name);
    }
}

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and roll");
        Student2 st = new Student2(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name and roll");
        Student2 ss = new Student2(sc.nextLine(), sc.nextInt());

        if (ss.equals(st)) {
            System.out.println("The two students are equal");
        } else {
            System.out.println("The two students are not equal");
        }
    }
}