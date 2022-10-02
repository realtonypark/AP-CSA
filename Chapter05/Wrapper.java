public class Wrapper {
    public static void main(String[] args){
        Integer intObj1 = 3;
        //Integer intObj2 = new Integer(5);
        Integer intObj2 = Integer.valueOf(5);
        Integer intObj3 = 5;
        Integer intObj4 = 4;
        int a = 3;

        System.out.println(intObj1 == intObj4);
        System.out.println(intObj2 == intObj3);
        System.out.println(intObj1 < intObj4);
        System.out.println(intObj1.intValue() < intObj4.intValue());
        System.out.println(intObj1 == a);
        
    }
}
