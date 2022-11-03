public class EqualsTest {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "world";

        String a1 = new String("hello");
        String a2 = new String("hello");
        String a3 = new String("world");

        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true

        System.out.println(a1 == a2); //false
        System.out.println(a1.equals(a2)); //true

        System.out.println(str1 == Equals.word); //true --> false
        System.out.println(str1.equals(Equals.word)); //true

        System.out.println(a1 == Equals.word); //false
        System.out.println(a1.equals(Equals.word)); //true

        a1 = a2;
        System.out.println(a1 == a2); //true
        System.out.println(a1.equals(a2)); //true

        // String과 Wrapper는 equals()가 오버라이딩되어 있기 때문에 content를 비교

    }
}
