public class ArrayListTraverse {
    public static void main(String[] args){

    }

    public static void insert(ArrayList<Integer> list, Integer value){
        int index = 0;
        while(index < list.size() && list.get(index) < value)
            index++;
        list.add(index, value);
    }

    public static void changeEvenToEmpty(ArrayList<String> strList){
        boolean even = true;
        int index = 0;
        while(index<=strList.size()){
            if(even)
                strList.set(index, "");
            index++;
            even = !even;
        }
    }
}