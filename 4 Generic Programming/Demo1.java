// program to perform swapping without generic

class Demo1{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
    void swap(double a,double b){
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
    void swap(char a,char b){
        char temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }

    public static void main(String args[]){
        
        Demo1 obj1 = new Demo1();
        obj1.swap(5,6);
        obj1.swap(5.56,6.78);
        obj1.swap('a','b');
    }
}