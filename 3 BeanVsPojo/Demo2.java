// Example showing the concept of Bean class
import java.util.Scanner;
import java.io.*;
class Student implements Serializable{
    private String name;
    private int rno;
    private double per;

    Student(){}
    // setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setRollNumber(int rno){
        this.rno=rno;
    }
    public void setPercentage(double per){
        this.per=per;
    }
    // getter methods
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rno;
    }
    public double getPercentage(){
        return per;
    }

}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Student obj = new Student();
        obj.setName(name);
        obj.setRollNumber(rno);
        obj.setPercentage(per);

        System.out.println("Name : "+obj.getName());
        System.out.println("Roll Number : "+obj.getRollNumber());
        System.out.println("Percentage : "+obj.getPercentage());

    }
}