// Example showing the concept of Wrapper class
@Deprecated
class Demo3{
    public static void main(String args[]){
       char ch = 'a';
       System.out.println("isUpperCase : "+Character.isUpperCase(ch));
       System.out.println("isLowerCase : "+Character.isLowerCase(ch));
       System.out.println("isAlphabetic : "+Character.isAlphabetic(ch));
       System.out.println("isDigit : "+Character.isDigit(ch));
       System.out.println("isSpace : "+Character.isSpace(ch));
       System.out.println("isWhiteSpace : "+Character.isWhitespace(ch));
    }
}


     