public class Examples {
    public static void main(String[] args){
        String str1 = "test";
        String str2 = "test";

        String str3 = new String("test");

        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); //true
    }
}
