// Example showing the concept of Wrapper class
class Demo8{
    static void myMethod1(int num){ // unboxing
        System.out.println("Result : "+num); // printing primitive value
    }
    static void myMethod2(Integer obj){ // autoboxing
        System.out.println("Result : "+obj); // printing object
    }
    static void myMethod3(Integer obj){ // wrapper class object handles null value
        System.out.println("Result : "+obj);
    }
    public static void main(String args[]){
        myMethod1(new Integer(100)); // passing object
        myMethod2(123); // passing primitive value
        myMethod3(null);
    }
}