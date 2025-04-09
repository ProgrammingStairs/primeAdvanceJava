// program to perform swapping with generic
class MyClass{}
class Demo3<DT>{ // generic class
    <DT>void swap(DT a,DT b){ // generic method
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        
        Demo3<MyClass> obj1 = new Demo3();
        obj1.swap(5,6);
        obj1.swap(5.56,6.78);
        obj1.swap('a','b');
    }
}