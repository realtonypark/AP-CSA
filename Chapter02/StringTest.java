public class StringTest {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "world";

        String res1 = str1;
        res1 = res1.concat(str2);

        StringBuilder res2 = new StringBuilder(str1);
        //res2.append(str1);
        res2.append(str2);
        
        System.out.println(res1);
        System.out.println(res2);
    }
}
