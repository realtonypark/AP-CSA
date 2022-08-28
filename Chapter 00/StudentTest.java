public class StudentTest 
{
    public static void main(String[] args)
    {
        //자신의 이름, 나이, 키 출력
        Student park = new Student("박승현", 18, 173.2f);
        
        System.out.println("이름: "+park.getmyName());
        System.out.println("나이: "+park.getmyAge());
        System.out.println("키: "+park.getmyHeight());
    }
}
