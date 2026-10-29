import java.util.*;
import java.io.*;
class Student 
{
  String name;
  int age;
  Student()
  {
    name="Unknown";
    age=0;
  }
  Student(String n)
  {
    name =n;
    age=0;
  }
  Student(String n,int a)
  {
    name=n;
    age=a;
  }
  void display()
  {
    System.out.println("Name: " +name);
    System.out.println("Age: " +age);
  }
}
public class Task10
{
  public static void main(String[]args)
  {
  Student s1=new Student();
  Student s2=new Student("Latha");
  Student s3=new Student("Priya" , 19);
  s1.display();
  s2.display();
  s3.display();
  }
}