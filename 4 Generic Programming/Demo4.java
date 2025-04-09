// program of generic

class Demo4<DT1,DT2>{ // generic class
    DT1 value1;
    DT2 value2;
    Demo4(DT1 a,DT2 b){ // generic method
        value1 = a;
        value2 = b;
    }
    void display(){
        System.out.println("value1 : "+value1+"\nvalue2 : "+value2);
    }
    public static void main(String args[]){        
        Demo4<Integer,String> obj1 = new Demo4(101,"Andrew Anderson");
        obj1.display();
    }
}