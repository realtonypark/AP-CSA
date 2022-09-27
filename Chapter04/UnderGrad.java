public class UnderGrad extends Student{
    public UnderGrad()
    {super();}

    public UnderGrad(String studName, int[] studTests, String studGrade)
    {super(studName, studTests, studGrade);}

    public void computeGrae()
    {
        if(getTestAverage() >= 70)
            setGrade("pass");
        else
            setGrade("Fail");
    }

}
