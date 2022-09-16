
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

class Student
{
    private String myName;
    private int myAge;
    private float myHeight;

    public Student(String n, int a, float h)
    {
        myName = n;
        myAge = a;
        myHeight = h;
    }

    public String getmyName()
    {
        return myName;
    }

    public int getmyAge()
    {
        return myAge;
    }

    public float getmyHeight()
    {
        return myHeight;
    }
}
