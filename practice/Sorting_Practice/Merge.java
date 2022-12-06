public class Merge {
    public static void sort(int[] a){
        mergeSort(a, 0, a.length-1);
    }

    public static void mergeSort(int[] a, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    public static void merge(int[] a, int start, int mid, int end){
        int l = a.length;
        int[] tmp = new int[l];
        for(int i=0; i<l; i++)
            tmp[i] = a[i];
        
        int p1 = start;
        int p2 = mid+1;
        int index = start;

        while(p1<=mid && p2<=end){
            if(tmp[p1] <= tmp[p2]){
                a[index] = tmp[p1];
                p1++;
            }
            else{
                a[index] = tmp[p2];
                p2++;
            }
            index++;
        }

        for(int i = 0; i <= mid - p1; i++)
            a[index+i] = tmp[p1+i];
    }
}
