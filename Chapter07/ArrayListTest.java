import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(list.size());

        for(int i=0; i<5; i++){
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.size());

        // crearing an ArrayList containing 0 1 4 9.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i<4; i++)
            list1.add(i*i); //exammple of autoboxing
                            //i*i wrapped in an Integer before insertion

        Integer intOb = list1.get(2); //assigns Integer wiith value 4 to intOb.
                                            //Leaves list unchanged.

        int n = list1.get(3); // example of auto-unboxing
                                    // Integer is retrieved and converted to int
                                    // n contains 9

        Integer x = list1.set(3, 5); //list is 0 1 4 5
                                                    //x contains Integer with value 9

        x = list.remove(2); //list is 0 1 5
                                    //x contains Integer with value 4
        
        list1.add(1, 7); //list is 0 7 1 5
        list1.add(2, 8); //list is 0 7 8 1 5
        
        System.out.println(n);
        System.out.println(x);
        System.out.println(list1);

        swap(list, 0, 2);
        System.out.println(list);
        
    }

    public static void swap(ArrayList<Integer> al, int i, int j){
        /*
        Integer temp = al.get(i);
        al.set(i, al.get(j));
        al.set(j, temp);
        */

        Integer temp = al.set(i, al.get(j));
        al.set(j, temp);
    }
}
