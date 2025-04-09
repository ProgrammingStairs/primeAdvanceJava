// program to perform swapping with generic
class Demo2<DT>{  // generic class
    void swap(DT a,DT b){
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        
        Demo2<Integer> obj1 = new Demo2();
        obj1.swap(5,6);

        Demo2<Double> obj2 = new Demo2();
        obj2.swap(5.56,6.78);

        Demo2<Character> obj3 = new Demo2();
        obj3.swap('a','b');
    }
}