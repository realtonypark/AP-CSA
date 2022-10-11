public class InputTest {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        double b = Double.parseDouble(args[1]);
        String c = args[2];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

// Main method input을 하는 Java 소스코드를 실행할 때는 
// java InputTest 1 5.5 hello 
// 위와 같이 실행해야 함.
