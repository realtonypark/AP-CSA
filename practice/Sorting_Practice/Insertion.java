public class Insertion {
    public static void sort(int[] a){
        int size = a.length;
        
        for(int i = 1; i<size; i++){
            int value = a[i];
            int j = i-1;
            while(j>=0 && value<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = value;
        }
    }
}
