// Example showing the concept of Wrapper class
class Demo6{
    public static void main(String args[]){
    //   Integer obj1 = new Integer(123);
    //   Integer obj2 = new Integer(678);

      Integer obj1 = 123;
      Integer obj2 = 678;
      System.out.println("Sum : "+(obj1+obj2));

      String s1 = obj1.toString();
      String s2 = obj2.toString();
      System.out.println("Sum : "+(s1+s2));
      
      String s3 = Integer.toString(34);
      String s4 = Float.toString(6.5f);
      System.out.println("Sum : "+(s3+s4));
       
      String s5 = Character.toString('r');
      System.out.println("String : "+s5);
      
    }
}


     