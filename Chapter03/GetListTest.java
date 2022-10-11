import java.util.*;

public class GetListTest{
    public static ArrayList<Integer> getList(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(10);
        return a;
    }
    
    public static void writeList(ArrayList<Integer> a){
        System.out.println("List is : " + a);
    }

    public static void main(String[] args){
        ArrayList<Integer> list = getList();
        writeList(list);
    }
}