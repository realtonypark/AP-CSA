public class Person {
    private String name;
    private int age;

    public Person(String aName, int anAge){
        name = aName;
        age = anAge;
    }

    public String toString(){
        return name + " " + age;
    }

    public void printPerson(){
        System.out.println(this);
    }
}
