class ToString {
    public int a;
    public String b;

    public ToString(){
        a = 0;
        b = "";
    }

    public ToString(int a1, String b1){
        a = a1;
        b = b1;
    }

    //toString() 메소드 오버라이딩
    public String toString(){
        return a + " " + b;
    }
    //toString() 메소드를 오버라이딩 할 떄는 객체를 정의하는(?) class에서 해야 함
}

class ToStringTest{
    public static void main(String[] args){
        ToString p1 = new ToString(5, "박승현");
        ToString p2 = new ToString(3, "Seunghyeon Park");

        System.out.println(p1.toString());
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p2);
        
        //p1.toString() 과 p1과 차이 없음 (object를 출력하려 하면 자동으로 toString()메소드가 invoke 되기 때문에)
    }
}