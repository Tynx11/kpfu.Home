package kpfu.homework.comparable;

/**
 * Created by Tony on 21.03.2017.
 */
public class Student implements Comparable <Student> {

    String name;
    int age;

   public int compareTo(Student other){
        int result = name.compareTo(other.name);
        if (result == 0 && age != other.age){
            result = (age - other.age) / Math.abs (age - other.age);
        }
        return result;
    }
}
