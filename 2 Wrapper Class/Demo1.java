// Example showing the concept of Wrapper class

class Demo1{
    public static void main(String args[]){
        int num = 100; // primitive datatype
        // conversion of primitive into wrapper class object
        Integer obj = Integer.valueOf(num); // wrapper class object

        System.out.println("Primitive value : "+num);
        System.out.println("object : "+obj);

        // conversion of wrapper class object into primitive value
        int res = obj.intValue();
        System.out.println("Primitive value : "+res);
    }
}