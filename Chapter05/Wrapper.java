public class Wrapper {
    public static void main(String[] args){
        Integer intObj1 = 3;
        Integer intObj7 = new Integer(5);
        Integer intObj8 = new Integer(5);
        Integer intObj9 = new Integer(7);
        Integer intObj2 = Integer.valueOf(5);
        Integer intObj3 = 5;
        Integer intObj4 = 4;
        Integer intObj5 = 3;
        Integer intObj6 = Integer.valueOf(5);
        int a = 3;


        System.out.println(intObj1 == intObj5); // true
        System.out.println(intObj1 == intObj4); // false
        System.out.println(intObj2 == intObj3); // true
        System.out.println(intObj1 < intObj4); // true
        System.out.println(intObj1.intValue() < intObj4.intValue()); // true
        System.out.println(intObj1 == a); //true

        System.out.println(intObj6 == intObj2); // true
        System.out.println(intObj6.intValue() == intObj2.intValue()); // true

        System.out.println(intObj7 == intObj8); // false
        System.out.println(intObj9 > intObj8); // true
    }
}