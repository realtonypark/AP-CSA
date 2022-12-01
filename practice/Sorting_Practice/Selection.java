public class Selection {
    public static void sort(int[] a){
        int size = a.length;
        for(int i = 0; i<size-1; i++){
            int key = i;
            int value = a[i];
            for(int j = i+1; j < size; j++){
                if(value > a[j]){
                    value = a[j];
                    key = j;
                }
            }
            int tmp = a[i];
            a[i] = value;
            a[key] = tmp;
        }
    }
}
