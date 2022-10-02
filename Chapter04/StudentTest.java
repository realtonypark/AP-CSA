public class StudentTest {
    public static void main(String[] args){
        Student s = new Student("Brian", new int[] {90, 94, 99}, "none");
        //Student g = new GradStudent("Kevin", new int[] {95, 100, 90}, "none", 1234);
        GradStudent g = new GradStudent("Kevin", new int[] {95, 100, 90}, "none", 1234);
    
        System.out.println(g.getName());
        System.out.println(g.getID());
    
        s.computeGrade();
        g.computeGrade();
    
        System.out.println(s.getGrade());
        System.out.println(g.getGrade());
    
        s.setGrade("Fail");
        g.setGrade("Fail");
    
        System.out.println(s.getGrade());
        System.out.println(g.getGrade());
            
    }
}

