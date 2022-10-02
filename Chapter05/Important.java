public class Important {
    public static void main(String[] args){
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");

        System.out.println(str1==str2); //same allocation in same code --> true (중요. 자바에서 자동적으로 같은 데이터는 같은 곳에 저장)
        System.out.println(str1==str3); //new operator --> false
        System.out.println(str1.equals(str2)); //overridden --> true
        System.out.println(str1.equals(str3)); //overridden -->  true
    }
}       