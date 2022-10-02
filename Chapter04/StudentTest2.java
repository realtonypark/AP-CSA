public class StudentTest2 {
    public static void computeAllGrades(Student[] studentList){
        for (Student s : studentList){
            if(s != null)
                s.computeGrade();
        }
    }

    public static void main(String[] args){
        Student[] stu = new Student[5];
        stu[0] = new Student("Brian", new int[] {90, 94, 99}, "none");
        stu[1] = new UnderGrad("Tim", new int[] {90, 90, 100}, "none");
        stu[2] = new GradStudent("Kevin", new int[] {85, 70, 90}, "none", 1234);

        computeAllGrades(stu);
        System.out.println(stu[0].getGrade());
        System.out.println(stu[0].getGrade());
        System.out.println(stu[0].getGrade());
        // System.out.println(stu[2].getID()); --> object가 GradStudent가 아닌 Student이므로 getID() 메소드 사용할 수 없음!
    }
}

//method parameter로 array, object 사용하는 것 익숙해지기!