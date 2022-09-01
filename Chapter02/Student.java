public class Student
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