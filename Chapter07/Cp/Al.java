import java.util.ArrayList;
import java.util.Random;

public class Al{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<7; i++){
            list.add(i);
        }

        Random rand = new Random();
        int randIndex = (int) (rand.nextDouble() * list.size());

        System.out.println(list);
        System.out.println(list.get(randIndex));
    }
}