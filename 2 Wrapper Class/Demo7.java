// Example showing the concept of Wrapper class
class Demo7{
    public static void main(String args[]){
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf("100");
        System.out.println("Sum : "+(obj1+obj2));

        Boolean obj3 = Boolean.valueOf("true");
        System.out.println("Boolean Value : "+obj3);

        Float obj4 = Float.valueOf("45.5f");
        System.out.println("Float value : "+obj4);

        Integer obj5 = Integer.valueOf("100",3);
        System.out.println("Result : "+obj5);

    }
}
/*
    1 x 3^2 + 0 x 3^1 + 0 x 3^0
    1 x 9 + 0 x 3 + 0 x 1
    9 + 0 + 0
    9
*/

     