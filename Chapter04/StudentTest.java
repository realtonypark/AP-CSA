public class StudentTest {
    public static void main(String[] args){
        Student s = new Student("Brian", new int[] {90, 94, 99}, "none");
        //Student g = new GradStudent("Kevin", new int[] {95, 100, 90}, "none", 1234);
        GradStudent g = new GradStudent("Kevin", new int[] {95, 100, 90}, "none", 1234);
        
        //4번 line은 Student object이므로 getID() 메소드 사용할 수 없음
        //5번 line은 GradStudent object이므로 getID() 메소드 사용할 수 있음

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

