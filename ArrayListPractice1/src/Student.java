import java.util.ArrayList;
import java.util.Objects;

public class Student {
    
    int rollNumber;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name);
    }

    public static void main(String[] args) {
        
        Student object = new Student();
        Student object12 = new Student();
        Student object2 = new Student();
        Student object3= new Student();





        System.out.println("object = " + object);
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        Integer num1 = list.get(2);
       // list


        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list = " + list);


    }
}
