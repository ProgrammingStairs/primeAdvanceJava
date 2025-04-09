// Example showing the concept of Pojo class
import java.util.Scanner;
class Student{
    String name;
    public int rno;
    double per;

    Student(String name,int rno,double per){
        this.name=name;
        this.rno=rno;
        this.per=per;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
}
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Student obj = new Student(name,rno,per);
        obj.display();
    }
}